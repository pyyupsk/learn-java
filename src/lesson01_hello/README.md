# 01 — Hello

First Java program. Learn the minimum to compile and run.

## Goals

- Write a class with a `public static void main(String[] args)` entry point.
- Print to stdout with `System.out.println(...)`.
- Understand how the filename must match the public class name (`Main.java` → `class Main`).

## Tasks

1. Create `Main.java` that prints `Hello, Java!`.
2. Print a second line using `System.out.print` (no newline) followed by `System.out.println`.
3. Use `args` — print the first command-line argument if present, otherwise a default.

## Run

```bash
cd src
javac lesson01_hello/Main.java
java lesson01_hello.Main
java lesson01_hello.Main First
```
