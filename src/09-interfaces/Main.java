/*
 * 09 — Interfaces
 *
 * Goal: code against contracts, not concrete classes.
 *
 * Rules:
 *   - `interface` methods are public and abstract by default.
 *   - A class can `implements` multiple interfaces.
 *   - `default` methods provide a body (Java 8+) — used as a fallback.
 *   - `static` methods on interfaces work like utility methods.
 *
 * Tasks:
 *   1. Define interface Shape with abstract `double area()` and
 *      `double perimeter()`.
 *   2. Add `default String describe()` returning "shape area=<area>".
 *   3. Add `static Shape unit()` returning a unit Square (side=1).
 *   4. Implement Circle (radius) and Square (side).
 *   5. In main, create a Circle(5) and a Square(4). Call all three methods on
 *      each. Then print Shape.unit().area().
 *
 * Expected output:
 *   Circle area=78.53981633974483 perim=31.41592653589793 desc=shape area=78.53981633974483
 *   Square area=16.0 perim=16.0 desc=shape area=16.0
 *   unit area=1.0
 *
 * Run:
 *   java src/09-interfaces/Main.java
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
