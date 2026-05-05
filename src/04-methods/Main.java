/*
 * 04 — Methods
 *
 * Goal: define and call methods.
 *
 * Rules:
 *   - Signature: [modifiers] returnType name(paramType param, ...)
 *   - `void` for no return.
 *   - `static` methods belong to the class (called without an instance).
 *   - Overloading: same name, different parameter types/count.
 *   - Varargs: `int... nums` — receive 0..N ints as an array.
 *   - Java is pass-by-value (object refs are values too — the ref is copied).
 *
 * Tasks:
 *   1. Write `static int add(int a, int b)` and print add(2, 3).
 *   2. Overload `static int square(int x)` and `static double square(double x)`.
 *      Print both.
 *   3. Write `static int sum(int... nums)`. Call with no args, with 1 arg,
 *      and with 5 args. Print each result.
 *   4. Write `static String greet(String name)` returning "Hello, <name>".
 *      Print greet("First").
 *   5. Write `static void tryMutate(int x)` that does x = 999.
 *      Call it and confirm the caller's variable did NOT change.
 *
 * Expected output:
 *   add(2,3)=5
 *   square(4)=16
 *   square(2.5)=6.25
 *   sum()=0
 *   sum(7)=7
 *   sum(1,2,3,4,5)=15
 *   Hello, First
 *   before=10 after=10
 *
 * Run:
 *   java src/04-methods/Main.java
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
