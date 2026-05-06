package lesson11_exceptions;

/*
 * 11 — Exceptions
 *
 * Goal: handle and raise errors.
 *
 * Rules:
 *   - try { ... } catch (X e) { ... } finally { ... } — finally always runs.
 *   - Checked exceptions (extend Exception) — caller must catch or declare
 *     via `throws`. Unchecked (extend RuntimeException) — optional.
 *   - Use multi-catch: catch (IOException | SQLException e).
 *   - Try-with-resources auto-closes AutoCloseable resources.
 *   - Throw with: throw new SomeException("msg");
 *
 * Tasks:
 *   1. Write `static int divide(int a, int b)`. Call divide(10, 0) inside a
 *      try/catch for ArithmeticException; print "caught: <msg>".
 *      Add a finally block that prints "done".
 *   2. Write `static void checkAge(int age)` that throws
 *      IllegalArgumentException for negative input. Catch it in main.
 *   3. Define `class InvalidUserException extends RuntimeException` (in this
 *      file). Throw and catch it.
 *   4. Define `class ConfigException extends Exception` (checked).
 *      Write `static void load() throws ConfigException` that throws it.
 *      Call from main inside a try/catch.
 *
 * Expected output:
 *   caught: / by zero
 *   done
 *   invalid: age must be >= 0
 *   user: bad user
 *   config: missing key
 *
 * Run:
 *   cd src
 *   javac lesson11_exceptions/Main.java
 *   java lesson11_exceptions.Main
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
