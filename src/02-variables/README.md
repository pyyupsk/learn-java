# 02 — Variables & Types

Java is statically typed. Every variable has a type, known at compile time.

## Goals

- Primitive types: `int`, `long`, `double`, `float`, `boolean`, `char`, `byte`, `short`.
- Reference types: `String`.
- `final` for constants.
- `var` for local type inference (Java 10+).
- Basic operators: `+ - * / %`, comparisons, logical.

## Tasks

1. Declare one variable of each primitive type and print it.
2. Declare a `final` constant and try reassigning it (observe the compile error, then revert).
3. Use `var` to declare a `String` and an `int` — confirm the inferred type works.
4. Compute integer division (`7 / 2`) vs double division (`7.0 / 2`) — print both.
5. Use `%` to check if a number is even.

## Run

```bash
java src/02-variables/Main.java
```
