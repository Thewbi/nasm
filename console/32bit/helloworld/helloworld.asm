;
; Simple NASM syntax assembly program for x86 (32 bit).
;
; Use commands below to assemble, link and run ($ is the prompt):
;   $ "C:\Program Files\NASM\nasm.exe" -f elf32 helloworld.asm
;   $ "C:\Program Files\NASM\nasm.exe" -f win32 -o helloworld.obj helloworld.asm 
;
;   Make sure the .o file is not opened in another application because windows locks files
;   $ "C:\aaa_se\MyLinker\x64\Debug\MyLinker.exe" -entry "main" -out "helloworld.exe" helloworld.obj
;
;   $ gcc -m32 -o hello hello.o
;   $ ./hello
;   Hello, world!
;

extern printf

section .text

global main

main:
    push ebp
    mov ebp, esp

    push msg
    call printf
    add esp, 4

    leave
    ret

section .data
    msg     db  'Hello, world!', 13, 10, 0