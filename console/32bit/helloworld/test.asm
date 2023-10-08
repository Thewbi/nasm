;
; Simple NASM syntax assembly program for x86 (32 bit).
;
; Use commands below to assemble, link and run ($ is the prompt):
;   $ "C:\Program Files\NASM\nasm.exe" -f elf32 test.asm
;   $ "C:\Program Files\NASM\nasm.exe" -f win32 -o test.obj test.asm 
;
; C:\Users\U5353\Downloads\PEview\PEview.exe
;
;   Make sure the .o file is not opened in another application because windows locks files
;   $ "C:\aaa_se\MyLinker\x64\Debug\MyLinker.exe" -entry "main" -out "helloworld.exe" helloworld.obj
;
;   $ gcc -m32 -o hello hello.o
;   $ ./hello
;   Hello, world!
;
; == Encoding ==
;
; How is "add ecx, eax" encoded? 
; Example here: https://www-user.tu-chemnitz.de/~heha/hsn/chm/x86.chm/x86.htm
;
; add ecx, eax ---> 0x01 0xC1 ---> 01 C1
;
; Alternatively:
; add ecx, eax ---> 03 C8 !!!!!
;
; Encoding is not unique! It can in some cases be done in multiple ways!
;
; x86 encodes instructions using up to 16 bytes!
; Some instructions do not use all 16 bytes, they are encoded in less bytes!
; "add ecx, eax" is encoded in two bytes for example (either 01 C1 or 03 C8)
;
; The 16 bytes are organized as follows:
;
; Instruction Prefix - (4 Byte)
; Instruction Opcode - (2 Byte)
; "mod-reg-r/m" aka. Addressing Mode and Operand Size (1 Byte)
; Scaled Indexed Byte (1 Byte)
; Displacement (4 Byte)
; Immediate Data (4 Byte)
;
; Out of these Groups of bytes only some are used to encode an instruction
; Within each individual Group only some of the bytes are actually used to 
; encode an instruction. E.g. the instruction "add ecx, eax" only uses one 
; Byte out of the two available Instruction Opcode bytes!
;
; Using "add ecx, eax" as an example: 
; - One Opcode byte is used and set to 0b00000000
; - The mod-reg-r/m byte is used and set to 0b11000001
;
; == Decoding ==
;
; https://www.cl.cam.ac.uk/~jrh13/spisa19/slides_03.pdf
; 1. Scan for prefixes. Legacy prefixes set flag variables. Repeat until you read a byte that is not a legacy prefix.
; 2. If this byte was 0x62, 0x8F, 0xC4, or 0xC5 then branch to handle these special cases (vector extension instructions) - We’ll skip these.
; 3. Read opcode bytes and determine if there is a MODRM byte.
; 4. Determine the effective address and operand sizes
; 5. If there is a SIB byte, read it and extract the Index, Base, Scale bits.
; 6. If there is, read it and extract the MOD, REG, RM bits to determine if a SIB byte exists. Else skip
;
;
; https://medium.com/@g.c.dassanayake/an-introduction-to-intel-32-bit-instruction-decoding-9b3b0c15bebb
;
; 1. Parse the optional "Instruction Prefix" bytes
; http://www.c-jump.com/CIS77/CPU/x86/X77_0240_prefix.htm
; State machine state: INSTRUCTION_PREFIX
; Start a loop that counts from 0 to 3 and ends early if a non-instruction-prefix byte is
; encountered. Instruction Prefix bytes are: F0H, 2EH, 36h, 3EH, 26h, 64h, 65h, 66H, 67h, F2H, F3h
;
; 2. Parse the opcode
; State machine state: OPCODE
; Check if the opcode is one or two byte in size. The byte 0FH makes the next two bytes the opcode,
; If no 0FH is present, the opcode has a single byte.
;
; 3. For single byte opcodes, resolve the opcode in the one-byte-opcode-map.
; row - upper nibble
; column - lower nibble.
; I think row, column are not required. Instead, the opcode 01 refers to ADD Evqp, Gvqp.
; On the page http://ref.x86asm.net/coder64-abc.html the opcode 01 is documented using:
; ADD r/m16/32/64 r16/32/64
; The interesting part is that the operands are given in several variants. The variants
; differ in bit-widths. So 16-bit, 32-bit or 64-bit. The decoder has to figure out
; if it uses 16, 32 or 64 bits. This information is encoded in the s-bit of the opcode.
; s= 1 means adding 32-bit values. With this information, 01 means ADD r/m32, r32 to us!
;
; 4. Resolve the operands.
; https://www-user.tu-chemnitz.de/~heha/hsn/chm/x86.chm/x86.htm
; Since the opcode 01 means ADD Evqp, Gvqp, when can now decode the first operand according
; to the specificiation Ev, and the second operand according to the specificiation Gv.
; E means a "mod-reg-r/m" follows, v means the size of the operand is 1 or 2 byte
; G means a the operand is encoded in the reg part of "mod-reg-r/m"
;
; 01H      C1H       == add ecx, eax
; 00000001 11000001
;
; 00000001 is the opcode byte, decoding it yields:
; 000000    - is the add instruction
; 0 (d-bit) - is the "Adding a Reg field to a reg or memory (r/m) field"
; 1 (s-bit) - 1 == adding 32 bit values
;
; 11000001 decodeing as "mod-reg-r/m" field yields:
; 11    - mod - indicates that the r/m field is a register
; 000   - reg - source field is the EAX register
; 001   - r/m - target field is the ECX register
;
; Index	Register
; 000	EAX
; 001	ECX
; 010	EDX
; 011	EBX
; 100	Illegal
; 101	EBP
; 110	ESI
; 111	EDI

section .text

global main

main:
    add ecx, eax