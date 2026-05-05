/*
 * 13 — Lambdas & Functional Interfaces
 *
 * Goal: pass behavior as a value.
 *
 * Rules:
 *   - Lambda syntax: (params) -> expression  OR  (params) -> { statements; }
 *   - Targets a "functional interface" — exactly ONE abstract method.
 *   - Common ones in java.util.function:
 *       Runnable                () -> void
 *       Supplier<T>             () -> T
 *       Consumer<T>             T -> void
 *       Function<T,R>           T -> R
 *       BiFunction<T,U,R>       (T,U) -> R
 *       Predicate<T>            T -> boolean
 *   - Method references: Class::method, instance::method, Class::new.
 *   - Captured locals must be effectively final.
 *
 * Tasks:
 *   1. Assign Runnable r = () -> System.out.println("running"); call r.run().
 *   2. Function<Integer,Integer> doubler = x -> x * 2; print doubler.apply(5).
 *   3. BiFunction<Integer,Integer,Integer> add; print add.apply(3, 4).
 *   4. Predicate<String> isEmpty = String::isEmpty; print test("") and test("x").
 *   5. Consumer<String> printer = System.out::println; call printer.accept("hi").
 *   6. Supplier<String> greet = () -> "hello"; print greet.get().
 *
 * Expected output:
 *   running
 *   double=10
 *   add=7
 *   isEmpty('')=true
 *   isEmpty('x')=false
 *   hi
 *   hello
 *
 * Run:
 *   java src/13-lambdas/Main.java
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
