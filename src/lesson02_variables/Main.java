package lesson02_variables;

/*
 * 02 — Variables & Types
 *
 * Goal: declare variables of different types and use basic operators.
 *
 * Rules:
 *   - Java is statically typed: every variable has a type known at compile time.
 *   - `final` makes a variable a constant (cannot be reassigned).
 *   - `var` infers the type from the right-hand side (locals only, Java 10+).
 *   - Integer division truncates: 7 / 2 == 3, but 7.0 / 2 == 3.5.
 *
 * Tasks:
 *   1. Declare: int age=25, double price=19.99, boolean active=true,
 *      char grade='A', String name="First". Print each.
 *   2. Declare `final int MAX = 100;` and print it.
 *   3. Declare `var inferred = "hello";` and print it.
 *   4. Print 7 / 2 and 7.0 / 2 — note the difference.
 *   5. Print whether 10 is even using the % operator.
 *
 * Expected output:
 *   age=25
 *   price=19.99
 *   active=true
 *   grade=A
 *   name=First
 *   MAX=100
 *   inferred=hello
 *   7/2=3
 *   7.0/2=3.5
 *   10 even? true
 *
 * Run:
 *   cd src
 *   javac lesson02_variables/Main.java
 *   java lesson02_variables.Main
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
