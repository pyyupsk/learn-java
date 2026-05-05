/*
 * 15 — Files & I/O
 *
 * Goal: read and write files with java.nio.file.
 *
 * Rules:
 *   - Path represents a file location: Path.of("foo.txt") or Paths.get(...).
 *   - Files.writeString / readString (Java 11+) for whole-file string I/O.
 *   - Files.readAllLines returns List<String>.
 *   - StandardOpenOption.APPEND for appending.
 *   - Most Files methods throw IOException — declare or catch.
 *   - Use try-with-resources for BufferedReader/Writer (auto-closes).
 *
 * Tasks:
 *   1. Create a temp file with Files.createTempFile("learn-", ".txt").
 *      Print its path.
 *   2. Write "first\nsecond\n" with Files.writeString. Read it back with
 *      Files.readString and print.
 *   3. Append "third\n" using StandardOpenOption.APPEND.
 *      Read with Files.readAllLines and print each line with its index.
 *   4. Print Files.size(path) and Files.exists(path).
 *   5. Delete the file with Files.deleteIfExists. Print exists() again.
 *
 *   Hint: declare `throws IOException` on main to keep the code short.
 *
 * Expected output (path will vary):
 *   path=/tmp/learn-XXXX.txt
 *   --- read ---
 *   first
 *   second
 *
 *   --- after append ---
 *   0: first
 *   1: second
 *   2: third
 *   size=19 exists=true
 *   exists after delete=false
 *
 * Run:
 *   java src/15-files/Main.java
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
