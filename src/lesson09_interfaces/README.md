# 09 — Interfaces

Contracts without implementation (mostly).

## Goals

- Declare an `interface` with abstract methods.
- `implements` keyword; one class can implement multiple interfaces.
- `default` methods (Java 8+).
- `static` methods on interfaces.
- Interfaces vs abstract classes — when to use which.
- Functional interfaces (single abstract method) — preview for lambdas.

## Tasks

1. Define a `Shape` interface with `area()` and `perimeter()`.
2. Implement `Circle` and `Square`.
3. Add a `default String describe()` on `Shape` that uses `area()`.
4. Write a method `print(Shape s)` and call it with both implementations.
5. Add a `static Shape unit()` factory on `Shape` returning a unit square.

## Run

```bash
cd src
javac lesson09_interfaces/Main.java
java lesson09_interfaces.Main
```
