# 04 — Methods

Reusable units of behavior.

## Goals

- Method declaration: return type, name, parameters.
- `void` for no return.
- Method overloading (same name, different parameter types).
- Varargs (`int... nums`).
- Static methods (called on the class, not an instance).
- Pass-by-value semantics.

## Tasks

1. Write `add(int a, int b)` returning `int`. Call from `main`.
2. Overload `square` for `int` and `double`.
3. Write a varargs method `sum(int... nums)` and call it with 0, 1, and many arguments.
4. Write `greet(String name)` returning a formatted string.
5. Demonstrate that mutating a primitive parameter inside a method does NOT change the caller's variable.

## Run

```bash
java src/04-methods/Main.java
```
