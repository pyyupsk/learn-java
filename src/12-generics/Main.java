/*
 * 12 — Generics
 *
 * Goal: write type-safe parameterized code.
 *
 * Rules:
 *   - Generic class: class Box<T> { T value; }
 *   - Generic method: static <T> T identity(T x) { return x; }
 *   - Bounded: <T extends Number> — T must be a Number subtype.
 *   - Wildcards:
 *       ? extends T  read-only producer (covariant)
 *       ? super T    write-only consumer (contravariant)
 *   - Type erasure: at runtime List<String> and List<Integer> are both List.
 *
 * Tasks:
 *   1. Define `class Box<T>` with field value, constructor, get(), set(T).
 *      Create Box<String>("hi") and Box<Integer>(42); print each get().
 *   2. Write `static <T> T first(java.util.List<T> list)` returning list.get(0).
 *      Call with List.of("a","b","c") and List.of(1,2,3).
 *   3. Write `static double sum(java.util.List<? extends Number> nums)`.
 *      Call with List.of(1,2,3) and List.of(1.5,2.5).
 *   4. Define `record Pair<A, B>(A first, B second) {}` and print
 *      Pair<String,Integer>("age", 25).
 *
 * Expected output:
 *   box(String)=hi
 *   box(Integer)=42
 *   first(strings)=a
 *   first(ints)=1
 *   sum(ints)=6.0
 *   sum(doubles)=4.0
 *   Pair[first=age, second=25]
 *
 * Run:
 *   java src/12-generics/Main.java
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
