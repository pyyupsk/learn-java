# 12 — Generics

Parameterize types so collections and APIs are type-safe at compile time.

## Goals

- Generic classes: `class Box<T> { T value; }`.
- Generic methods: `<T> T identity(T x)`.
- Multiple type parameters: `Pair<A, B>`.
- Bounded type parameters: `<T extends Number>`.
- Wildcards:
  - `? extends T` — read (covariant, producer).
  - `? super T` — write (contravariant, consumer).
  - `?` — unknown.
- Type erasure (mostly): generics exist at compile time, not at runtime.

## Tasks

1. Build a generic `Box<T>` with `get()` / `set()`.
2. Write a generic method `<T> T first(List<T> list)` returning the first element.
3. Write `double sum(List<? extends Number> nums)` — confirm it accepts `List<Integer>` and `List<Double>`.
4. Define a generic `record Pair<A, B>(A first, B second)`.
5. Try storing different types in a `List` (raw vs typed) — observe the compile-time vs runtime error.

## Run

```bash
java src/12-generics/Main.java
```
