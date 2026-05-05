/*
 * 08 — Inheritance
 *
 * Goal: extend a class and override behavior.
 *
 * Rules:
 *   - `class B extends A` — single inheritance only.
 *   - Use `super(...)` to call a parent constructor (must be first line).
 *   - Use @Override on overridden methods (compiler verifies).
 *   - Polymorphism: `Animal a = new Dog()` — calls Dog's overridden methods.
 *   - `abstract` class cannot be instantiated; `abstract` method has no body.
 *   - `final` method cannot be overridden; `final` class cannot be extended.
 *
 * Tasks:
 *   1. Define abstract class Animal with field `name` and abstract `speak()`.
 *   2. Define Dog extends Animal — speak() prints "<name> barks".
 *   3. Define Cat extends Animal — speak() prints "<name> meows".
 *   4. Put a Dog("Rex") and Cat("Whiskers") into Animal[] and call speak()
 *      on each in a loop — observe polymorphic dispatch.
 *   5. Add `final void describe()` on Animal that prints "Animal name=<name>".
 *      Call it from main on each animal.
 *
 * Expected output:
 *   Rex barks
 *   Whiskers meows
 *   Animal name=Rex
 *   Animal name=Whiskers
 *
 * Run:
 *   java src/08-inheritance/Main.java
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
