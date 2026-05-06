# 07 — Classes & Objects

The OOP foundation.

## Goals

- Define a class with fields, constructor, and methods.
- `private` fields with getters/setters (encapsulation).
- `this` keyword.
- Multiple constructors (overloading) and `this(...)` constructor chaining.
- `record` for immutable data carriers (Java 16+).
- `toString`, `equals`, `hashCode` (auto-generated for records).

## Tasks

1. Create a `Person` class with `name`, `age`, a constructor, and a `greet()` method.
2. Add a second constructor that defaults `age` to 0 and chains via `this(...)`.
3. Add a getter/setter for `age` with validation (no negatives).
4. Override `toString()` so `System.out.println(person)` prints something useful.
5. Create a `Point` as a `record` and print it — note `toString`/`equals` come for free.

## Run

```bash
cd src
javac lesson07_classes/Main.java
java lesson07_classes.Main
```
