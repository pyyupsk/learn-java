# 08 — Inheritance

Reuse and specialize behavior via `extends`.

## Goals

- `extends` for class inheritance (single inheritance only).
- `super(...)` to call a parent constructor.
- `@Override` to override methods.
- `protected` access modifier.
- Polymorphism: a subtype reference can be held in a supertype variable.
- `abstract` classes and methods.
- `final` classes/methods (cannot be extended/overridden).

## Tasks

1. Create an `Animal` base class with `name` and `speak()`.
2. Create `Dog` and `Cat` subclasses that override `speak()`.
3. Put a `Dog` and `Cat` into an `Animal[]` and call `speak()` in a loop — observe polymorphism.
4. Make `Animal` `abstract` with `abstract void speak()` — confirm subclasses must implement it.
5. Add a `final` method on `Animal` and try overriding it (observe the compile error).

## Run

```bash
java src/08-inheritance/Main.java
```
