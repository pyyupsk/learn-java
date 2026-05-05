# 14 — Streams

Declarative pipelines over collections.

## Goals

- Build a stream: `collection.stream()`, `Stream.of(...)`, `IntStream.range(...)`.
- Intermediate ops: `filter`, `map`, `flatMap`, `distinct`, `sorted`, `limit`, `skip`.
- Terminal ops: `forEach`, `count`, `toList`, `collect`, `reduce`, `findFirst`, `anyMatch`.
- `Collectors`: `toList`, `toSet`, `toMap`, `joining`, `groupingBy`, `partitioningBy`.
- Primitive streams: `IntStream`, `LongStream`, `DoubleStream` (sum, average, max).
- Streams are lazy and one-shot.

## Tasks

1. From `List.of(1..10)`, sum the even squares.
2. From a list of words, return them uppercased, sorted, distinct, as a `List<String>`.
3. Group a list of `Person` by first letter of name into a `Map<Character, List<Person>>`.
4. Use `IntStream.rangeClosed(1, 100).sum()` to sum 1–100.
5. Try reusing a stream after a terminal op — observe `IllegalStateException`.

## Run

```bash
java src/14-streams/Main.java
```
