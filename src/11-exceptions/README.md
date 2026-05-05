# 11 — Exceptions

Errors are objects you can `throw` and `catch`.

## Goals

- `try` / `catch` / `finally`.
- Multi-catch: `catch (IOException | SQLException e)`.
- `throw` to raise; `throws` in method signature.
- Checked vs unchecked exceptions.
  - Checked: extend `Exception` — caller must handle or declare.
  - Unchecked: extend `RuntimeException` — optional.
- Try-with-resources for `AutoCloseable` resources.
- Custom exception classes.

## Tasks

1. Write `divide(int a, int b)` and catch `ArithmeticException` when `b == 0`.
2. Write `checkAge(int age)` that throws `IllegalArgumentException` for negative input.
3. Define a custom `InvalidUserException extends RuntimeException`. Throw and catch it.
4. Define a checked `ConfigException extends Exception`. Show the compile error if you forget `throws` or `try/catch`.
5. Write a method that uses try-with-resources (e.g. with `BufferedReader`) — verify the resource closes.

## Run

```bash
java src/11-exceptions/Main.java
```
