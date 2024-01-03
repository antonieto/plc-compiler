import os
import subprocess
from typing import Tuple
import pytest
from case import Compiler, CompilerAssembler
from rich.console import Console
import functools


# Test directories
PLC_TEST_PATH = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/plc-test/'
PLC_OUT_PATH = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/plc-out/'

# Cup compilation
CUP_SOURCE_FILE = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/Source.cup'
CUP_COMPILE_COMMAND = f'cup {CUP_SOURCE_FILE}'

# JFlex compilation
JFLEX_SOURCE_FILE = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/Source.flex'
JFLEX_COMPILE_COMMAND = f'jflex {JFLEX_SOURCE_FILE} -d ./'

# JAVAC Commands
CUPPATH  = '/Users/antoniochairesmonroy/Applications/cup-0.11b/java-cup-11b-runtime.jar'
JAVA_SOURCE = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/*.java'


CTD_PATH = '/Users/antoniochairesmonroy/IdeaProjects/pl/codegen_final/src/tests/ctd'

# Compiles cup source code
def cup_action():
    subprocess.run(CUP_COMPILE_COMMAND, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True, check=True)

def jflex_action():
    subprocess.run(JFLEX_COMPILE_COMMAND, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True, check=True)
        

def javac_action():
    output = subprocess.run(f'javac -cp {CUPPATH}:. {JAVA_SOURCE}', shell=True, capture_output=True, text=True)
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
    
    return output


@pytest.fixture(scope='class', autouse=True)
def prepare():
    console = Console()
    assembler = CompilerAssembler(
        console=console,
        actions=[
            cup_action,
            jflex_action,
            javac_action,
        ]
    )
    get_plc_tests()
    assembler.assemble()
    yield


class TestAll:
    """
        Interptretates a three-way-code representation using the CTD binary.
    """
    def run_ctd(self, src: str) -> str:
        out = subprocess.check_output([CTD_PATH, src])
        return str(out)
    
    """
        Compiles PLC to CTD code representation.
    """
    def plc_to_ctd(self, compiler: Compiler, src_path: str, test_name: str) -> str:
        return compiler.compile(src_path)
    
    @pytest.mark.parametrize('test_case', get_plc_tests())
    def test_one(self, test_case: Tuple[str, str]):
        name, content = test_case

        outputs = get_plc_out()
        assert 1 == 1
        for o_name, o_content in outputs:
            if o_name.startswith(name.split('.')[0]):
                path = os.path.join(PLC_TEST_PATH, name)
                real_output = self.run_ctd(path)
                assert o_content == real_output

