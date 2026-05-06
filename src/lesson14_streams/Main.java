package lesson14_streams;

/*
 * 14 — Streams
 *
 * Goal: process collections declaratively.
 *
 * Rules:
 *   - Build with collection.stream(), Stream.of(...), or IntStream.range(...).
 *   - Intermediate ops are lazy: filter, map, sorted, distinct, limit, skip.
 *   - Terminal ops trigger execution: forEach, count, toList, collect, reduce.
 *   - A stream is one-shot — reusing it throws IllegalStateException.
 *   - Use Collectors for grouping, partitioning, joining.
 *
 * Tasks:
 *   1. Given List.of(1..10), compute the sum of even squares.
 *      (i.e. for each n where n%2==0, square it; sum them.)
 *   2. From List.of("c","a","b","a"), produce uppercase, sorted, distinct
 *      as a List<String>.
 *   3. From List.of(1..10), count how many > 5.
 *   4. Use Collectors.joining(", ", "[", "]") to format List.of(1,2,3) as
 *      "[1, 2, 3]".
 *   5. Use Collectors.partitioningBy to split List.of(1..10) into evens/odds.
 *      Print the resulting Map<Boolean, List<Integer>>.
 *   6. Sum 1..100 with IntStream.rangeClosed(1, 100).sum().
 *
 * Expected output:
 *   even squares sum=220
 *   sorted upper distinct=[A, B, C]
 *   count > 5 = 5
 *   joined=[1, 2, 3]
 *   partitioned={false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}
 *   1..100 sum=5050
 *
 * Run:
 *   cd src
 *   javac lesson14_streams/Main.java
 *   java lesson14_streams.Main
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
