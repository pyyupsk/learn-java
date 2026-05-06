# 15 — Files & I/O

Modern file I/O with `java.nio.file`.

## Goals

- `Path` and `Paths.get(...)` / `Path.of(...)`.
- `Files.writeString`, `Files.readString` (Java 11+).
- `Files.readAllLines`, `Files.write`.
- `Files.exists`, `Files.size`, `Files.delete`, `Files.createDirectories`.
- Append with `StandardOpenOption.APPEND`.
- Try-with-resources for `BufferedReader` / `BufferedWriter`.
- Walk a directory: `Files.walk` / `Files.list`.
- Checked `IOException` — must declare or catch.

## Tasks

1. Write `"hello\n"` to a temp file with `Files.writeString`. Read it back.
2. Append a second line and re-read.
3. Read line by line with `Files.readAllLines` and print with index.
4. List the contents of the current directory using `Files.list`.
5. Use try-with-resources to read a file with `BufferedReader` line by line.

## Run

```bash
cd src
javac lesson15_files/Main.java
java lesson15_files.Main
```
