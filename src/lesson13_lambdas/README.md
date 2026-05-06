# 13 — Lambdas & Functional Interfaces

Treat behavior as a value.

## Goals

- Lambda syntax: `(x, y) -> x + y`.
- Functional interfaces: `Runnable`, `Supplier<T>`, `Consumer<T>`, `Function<T, R>`, `BiFunction<T, U, R>`, `Predicate<T>`.
- Method references: `String::isEmpty`, `System.out::println`, `Integer::parseInt`.
- Capturing variables (must be effectively final).
- Defining your own `@FunctionalInterface`.

## Tasks

1. Pass a `Runnable` lambda to `new Thread(...)` and start it.
2. Use `Function<Integer, Integer>` to define a `doubler` and apply it.
3. Use `Predicate<String>` to filter strings — e.g. non-empty, length > 3.
4. Convert each lambda into an equivalent method reference where possible.
5. Define `@FunctionalInterface interface Transformer<T, R> { R apply(T input); }` and use it.

## Run

```bash
cd src
javac lesson13_lambdas/Main.java
java lesson13_lambdas.Main
```
