import subprocess
from typing import Callable, Optional
from rich.console import Console
from rich import print as rprint

"""
    Usually, compiler-copmpiler pipelines involve: lexical analyzis and parser generation
"""
class CompilerAssembler():
    
    actions: list[Callable]
    console: Console
    
    def __init__(
        self,
        console: Console,
        actions: list[Callable],
    ):
        if actions is not None:
            self.actions = actions

        self.console = console

    """
        Runs a pipeline of actions.
    """
    def assemble(self):
        for action in self.actions:
            try:
                print(f'Running action: {action.__name__}')
                action()
            except Exception as e:
                self.console.print_exception()
                e.add_note(f'Failed to run action: {action.__name__}')
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
        try:
            compile_cmd = f'{self.cmd_prefix} {self.path}' if self.cmd_prefix is not None else self.path
            output = subprocess.check_output(f'{compile_cmd} {src_path}', shell=True)
            out_str = output.decode(encoding='utf-8')
            if target_directory:
                file = open(target_directory, 'w+')
                file.write(out_str)
            return out_str
                
        except Exception as e:
            print('Failed to run command', e)
            return str(e)
                
