/*
 * 07 — Classes & Objects
 *
 * Goal: define and use your own types.
 *
 * Rules:
 *   - A .java file may contain one `public` class (matching filename) plus
 *     any number of non-public classes.
 *   - `private` fields are hidden; expose with getters/setters.
 *   - `this` refers to the current instance.
 *   - `record` (Java 16+) auto-generates constructor, accessors, toString,
 *     equals, hashCode.
 *
 * Tasks:
 *   1. Define class Person with private fields name (String) and age (int),
 *      a constructor, and method greet() that prints "Hi, I'm <name> (<age>)".
 *   2. Add a second constructor Person(String name) that defaults age to 0
 *      via this(name, 0).
 *   3. Add setAge(int) that throws IllegalArgumentException if negative.
 *   4. Override toString() to return "Person{name=<n>, age=<a>}".
 *   5. Define `record Point(int x, int y) {}` and print one — note toString
 *      is auto-generated.
 *
 * Expected output:
 *   Hi, I'm First (25)
 *   Hi, I'm Bob (0)
 *   Person{name=First, age=26}
 *   Point[x=3, y=4]
 *
 * Run:
 *   java src/07-classes/Main.java
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
