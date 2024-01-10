from dataclasses import dataclass
import subprocess
from typing import Callable, Optional, Tuple
from rich.console import Console
from rich import print as rprint

"""
    Usually, compiler-copmpiler pipelines involve: lexical analyzis and parser generation
"""
class CompilerAssembler():
    
    actions: list[Tuple[Callable, str]]
    console: Console
    
    def __init__(
        self,
        console: Console,
        actions: list[Tuple[Callable, str]],
    ):
        if actions is not None:
            self.actions = actions

        self.console = console

    """
        Runs a pipeline of actions.
    """
    def assemble(self):
        for action in self.actions:
            method, name = action
            try:
                print(f'Running action: {name}')
                method()
            except Exception as e:
                self.console.print_exception()
                e.add_note(f'Failed to run action: {name}')
                raise e
        rprint('[green underline]Succesfully assembled compiler')


class Compiler():
    path: str
    cmd_prefix: Optional[str]
    def __init__(
        self,
        path: str,
        cmd_prefix: Optional[str]
    ):
        self.path = path
        if cmd_prefix is not None:
            self.cmd_prefix = cmd_prefix

    def compile(self, src_path: str, target_directory: Optional[str] = None) -> str:
        compile_cmd = f'{self.cmd_prefix} {self.path}' if self.cmd_prefix is not None else self.path
        cmd = f'{compile_cmd} {src_path} {target_directory}'
        print('CMD: ' + cmd)
        subprocess.run(f'{compile_cmd} {src_path} {target_directory}', shell=True)
        return '' 

@dataclass
class CompilerTestCase:
    # Base name of the test (i.e. a1)
    name: str
    # Source code path (e.g. /src/tests/plx-test/a1.plx)
    source_path: str
    # CTD 
    ctd_path: str
    # Expected output path (e.g. /src/tests/plc-out)
    expected_output_path: str
    
