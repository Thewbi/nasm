; "C:\Program Files\NASM\nasm.exe" -fwin32 helloworld.asm
; C:\masm32\bin\link /subsystem:windows /nodefaultlib /entry:main helloworld.obj C:\masm32\lib\kernel32.lib

;include \masm32\include\user32.inc
;include \masm32\include\kernel32.inc
;includelib \masm32\lib\user32.lib
;includelib \masm32\lib\kernel32.lib

global _main
    extern  _GetStdHandle@4
    extern  _WriteFile@20
    extern  _ExitProcess@4

    section .text
_main:
    ; DWORD  bytes;    
    mov     ebp, esp
    sub     esp, 4

    ; hStdOut = GetstdHandle( STD_OUTPUT_HANDLE)
    push    -11
    call    _GetStdHandle@4
    mov     ebx, eax    

    ; WriteFile( hstdOut, message, length(message), &bytes, 0);
    push    0
    lea     eax, [ebp-4]
    push    eax
    push    (message_end - message)
    push    message
    push    ebx
    call    _WriteFile@20

    ; ExitProcess(0)
    push    0
    call    _ExitProcess@4

    ; never here
    hlt
message:
    db      'Hello, World', 10
message_end: