# 10 — Collections

The Java Collections Framework: `List`, `Set`, `Map`, `Queue`, `Deque`.

## Goals

- `ArrayList` vs `LinkedList`.
- `HashSet` vs `TreeSet` (ordered).
- `HashMap` vs `TreeMap`.
- `Queue` (FIFO) via `LinkedList`/`ArrayDeque`.
- `Deque`/stack via `ArrayDeque` (prefer over legacy `Stack`).
- Immutable factories: `List.of(...)`, `Set.of(...)`, `Map.of(...)`.
- Iteration patterns: for-each, `Iterator`, `forEach`.

## Tasks

1. Build an `ArrayList<String>` of fruits. Add, remove, iterate.
2. Use a `HashSet<Integer>` to deduplicate a list with repeated values.
3. Build a `HashMap<String, Integer>` and iterate over `entrySet()`.
4. Use `ArrayDeque` as a stack (`push`/`pop`/`peek`).
5. Use `LinkedList` as a queue (`offer`/`poll`).
6. Create an immutable list with `List.of(...)` and try `add` on it (observe the runtime exception).

## Run

```bash
cd src
javac lesson10_collections/Main.java
java lesson10_collections.Main
```
