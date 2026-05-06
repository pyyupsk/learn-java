# learn-java

Self-paced Java learning. Each folder under `src/` is a topic with a `README.md` describing what to build. Write `Main.java` yourself.

## Requirements

- JDK 26+ (`java --version`).

## Run any topic

Each lesson lives in its own package under `src/`. Compile, then run with the fully-qualified class name:

```bash
cd src
javac lesson01_hello/Main.java
java lesson01_hello.Main
```

Pass args as usual:

```bash
java lesson01_hello.Main First
```

> Note: package directives mean single-file mode (`java src/.../Main.java`) won't work — you must compile first.

## Topics

1. [lesson01_hello](src/lesson01_hello/README.md) — first program, `main`, printing
2. [lesson02_variables](src/lesson02_variables/README.md) — primitives, `final`, `var`
3. [lesson03_control_flow](src/lesson03_control_flow/README.md) — `if`, `switch`, loops
4. [lesson04_methods](src/lesson04_methods/README.md) — declarations, overloading, varargs
5. [lesson05_arrays](src/lesson05_arrays/README.md) — 1D, 2D, `Arrays` helpers
6. [lesson06_strings](src/lesson06_strings/README.md) — `String`, `StringBuilder`, text blocks
7. [lesson07_classes](src/lesson07_classes/README.md) — fields, constructors, `record`
8. [lesson08_inheritance](src/lesson08_inheritance/README.md) — `extends`, polymorphism, `abstract`
9. [lesson09_interfaces](src/lesson09_interfaces/README.md) — contracts, `default`, `static`
10. [lesson10_collections](src/lesson10_collections/README.md) — `List`, `Set`, `Map`, `Deque`
11. [lesson11_exceptions](src/lesson11_exceptions/README.md) — `try`/`catch`, checked vs unchecked
12. [lesson12_generics](src/lesson12_generics/README.md) — `<T>`, bounds, wildcards
13. [lesson13_lambdas](src/lesson13_lambdas/README.md) — functional interfaces, method refs
14. [lesson14_streams](src/lesson14_streams/README.md) — pipelines, collectors
15. [lesson15_files](src/lesson15_files/README.md) — `java.nio.file`, try-with-resources

## Recommendation

Do one topic per session. Read the topic README, write `Main.java` from scratch, run it, then move on.
