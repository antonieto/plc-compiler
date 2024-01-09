import os
import subprocess
from typing import Tuple
import pytest
from case import Compiler, CompilerAssembler, CompilerTestCase
from rich.console import Console
import functools


# Test directories
PLC_TEST_PATH = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/plc-test/'
PLC_OUT_PATH = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/plc-out/'

CTD_OUTPUT_PATH = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/ctd-out/'

PLX_TEST_PATH = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/plx-test/'
PLX_OUT_PATH = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/plx-out/'

# Cup compilation
CUP_SOURCE_FILE = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/PLC.cup'
PLX_CUP_SOURCE_FILE = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/PLXC.cup'

# JFlex compilation
JFLEX_SOURCE_FILE = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/PLC.flex'
PLXC_JFLEX_SOURCE_FILE = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/PLXC.flex'

# JAVAC Commands
CUPPATH  = '/Users/antoniochairesmonroy/Applications/cup-0.11b/java-cup-11b-runtime.jar'
JAVA_SOURCE = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/*/*.java'


CTD_PATH = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/ctd'

OUTPUT_PATH= '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src'

# Compiles cup source code
def cup_action(src: str):
    def action():
        output = subprocess.run(f'cup {src}', shell=True, text=True, capture_output=True)
        if output.returncode != 0:
            raise Exception(f'Failed to compile java source: {output.stdout} | {output.stderr}')
        
        output = subprocess.run(f'mv -f parser.java {OUTPUT_PATH}', shell=True, text=True, capture_output=True)
        if output.returncode != 0:
            raise Exception(f'Failed to move files: {output.stdout} | {output.stderr}')
        output = subprocess.run(f'mv -f sym.java {OUTPUT_PATH}', shell=True, text=True, capture_output=True)
        if output.returncode != 0:
            raise Exception(f'Failed to move files: {output.stdout} | {output.stderr}')
    return action

def jflex_action(src: str):
    def action():
        subprocess.run(f'jflex -d {OUTPUT_PATH} {src}', shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True, check=True)
    return action

def javac_action():
    output = subprocess.run(f'javac -d {OUTPUT_PATH} -cp {CUPPATH}:. {JAVA_SOURCE}', shell=True, capture_output=True, text=True)
    if output.returncode != 0:
        raise Exception(f'Failed to compile java source: {output.stdout} | {output.stderr}')

@functools.cache
def get_plc_tests() -> list[Tuple[str, str]]:
    names = os.listdir(PLC_TEST_PATH)
    output = []
    for name in names:
        file = open(os.path.join(PLC_TEST_PATH, name), 'r', encoding='iso-8859-15')
        content = file.read()
        output.append((name, content))
        
    return output
    
@functools.cache
def get_plc_out() -> list[Tuple[str, str]]:
    names = os.listdir(PLC_OUT_PATH)
    output = []
    for name in names:
        file = open(os.path.join(PLC_OUT_PATH, name), 'r', encoding='iso-8859-15')
        content = file.read()
        output.append((name, content))
    # Sort by name
    output.sort(key=lambda x: x[0])
    return output


@pytest.fixture(scope='class', autouse=True)
def prepare():
    console = Console()
    plc_assembler = CompilerAssembler(
        console=console,
        actions=[
            (cup_action(CUP_SOURCE_FILE), 'cup_action'),
            (jflex_action(JFLEX_SOURCE_FILE), 'jflex_action'),
            (javac_action, 'javac_action'),
        ]
    )
    plx_assembler = CompilerAssembler(
            console=console,
            actions=[
                (cup_action(PLX_CUP_SOURCE_FILE), 'cup_action'),
                (jflex_action(PLXC_JFLEX_SOURCE_FILE), 'jflex_action'),
                (javac_action, 'javac_action'),
            ]
    )
    plc_assembler.assemble()
    plx_assembler.assemble()
    yield

def get_plx_tests() -> list[CompilerTestCase]:
    tests = []
    # Walk plx-test path and build
    for name in os.listdir(PLX_TEST_PATH):
        real_name = name
        name = name.split('.')[0]
        tests.append(CompilerTestCase(
            name=name,
            source_path=os.path.join(PLX_TEST_PATH, real_name),
            ctd_path=os.path.join(CTD_OUTPUT_PATH, name + '.ctd'),
            expected_output_path=os.path.join(PLX_OUT_PATH, name + '.plxout')
            ))
    return tests

class TestAll:
    """
        Interptretates a three-way-code representation using the CTD binary.
    """
    def run_ctd(self, src: str) -> str:
        cmd = f'{CTD_PATH} {src}'
        out = subprocess.run(cmd, text=True, capture_output=True, shell=True)
        if out.returncode != 0:
            err = out.stderr
            raise Exception(f'CTD Failed: {err}')
        return out.stdout
    """
        Compiles PLC to CTD code representation.
    """
    def plc_to_ctd(self, compiler: Compiler, src_path: str, test_name: str) -> str:
        return compiler.compile(src_path=src_path, target_directory=f'{CTD_OUTPUT_PATH}{test_name}.ctd')
    
    @pytest.mark.parametrize('test_case', get_plc_out(), ids= lambda t: t[0])
    @pytest.mark.skip
    def test_plc(self, test_case: Tuple[str, str]):
        compiler = Compiler(
            path=f'{CUPPATH}:/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/ PLC',
            cmd_prefix=f'java -cp'
        )
        name, _ = test_case
        name = name.split('.')[0]
        outputs = get_plc_out()
        for o_name, o_content in outputs:
            if o_name.startswith(name.split('.')[0]):
                path = os.path.join(PLC_TEST_PATH, f'{name}.pl')
                self.plc_to_ctd(compiler=compiler, src_path=path, test_name=name)
                ctd_output = self.run_ctd(f'{CTD_OUTPUT_PATH}{name}.ctd')
                assert ctd_output == o_content

    @pytest.mark.parametrize('test_case', get_plx_tests(), ids=lambda t: t.name)
    def test_plx(self, test_case: CompilerTestCase):
        compiler = Compiler(
            path=f'{CUPPATH}:/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/ PLXC',
            cmd_prefix='java -cp'
        )
        self.plc_to_ctd(compiler=compiler, src_path=test_case.source_path, test_name=test_case.name)
        ctd_output = self.run_ctd(f'{CTD_OUTPUT_PATH}{test_case.name}.ctd')
        expected = open(test_case.expected_output_path, 'r').read()
        assert ctd_output == expected
