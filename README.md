# learn-java

Self-paced Java learning. Each folder under `src/` is a topic with a `README.md` describing what to build. Write `Main.java` yourself.

## Requirements

- JDK 21+ (`java --version`).

## Run any topic

JDK 11+ supports single-file source mode — no compile step needed:

```bash
java src/01-hello/Main.java
java src/02-variables/Main.java
# ...
```

If a file uses `args`:

```bash
java src/01-hello/Main.java First
```

## Topics

1. [01-hello](src/01-hello/README.md) — first program, `main`, printing
2. [02-variables](src/02-variables/README.md) — primitives, `final`, `var`
3. [03-control-flow](src/03-control-flow/README.md) — `if`, `switch`, loops
4. [04-methods](src/04-methods/README.md) — declarations, overloading, varargs
5. [05-arrays](src/05-arrays/README.md) — 1D, 2D, `Arrays` helpers
6. [06-strings](src/06-strings/README.md) — `String`, `StringBuilder`, text blocks
7. [07-classes](src/07-classes/README.md) — fields, constructors, `record`
8. [08-inheritance](src/08-inheritance/README.md) — `extends`, polymorphism, `abstract`
9. [09-interfaces](src/09-interfaces/README.md) — contracts, `default`, `static`
10. [10-collections](src/10-collections/README.md) — `List`, `Set`, `Map`, `Deque`
11. [11-exceptions](src/11-exceptions/README.md) — `try`/`catch`, checked vs unchecked
12. [12-generics](src/12-generics/README.md) — `<T>`, bounds, wildcards
13. [13-lambdas](src/13-lambdas/README.md) — functional interfaces, method refs
14. [14-streams](src/14-streams/README.md) — pipelines, collectors
15. [15-files](src/15-files/README.md) — `java.nio.file`, try-with-resources

## Recommendation

Do one topic per session. Read the topic README, write `Main.java` from scratch, run it, then move on.
