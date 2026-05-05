/*
 * 10 — Collections
 *
 * Goal: use the Java Collections Framework.
 *
 * Rules:
 *   - Import from java.util: List, ArrayList, Set, HashSet, Map, HashMap, etc.
 *   - Prefer the interface on the left: `List<X> list = new ArrayList<>();`.
 *   - List.of(...), Set.of(...), Map.of(...) return IMMUTABLE collections.
 *   - Use ArrayDeque as both stack (push/pop) and queue (offer/poll).
 *   - HashMap iteration order is undefined; LinkedHashMap preserves insertion.
 *
 * Tasks:
 *   1. Build an ArrayList<String> of {"apple","banana","cherry"}. Print it
 *      and its size.
 *   2. Make a HashSet<Integer> from List.of(1,2,2,3,3,3) — print it (dedup).
 *   3. Build HashMap<String,Integer> with 3 entries; iterate over entrySet()
 *      and print "<key>=<value>".
 *   4. Use ArrayDeque<Integer> as a stack: push 1,2,3 then pop once and peek.
 *   5. Use LinkedList<String> as a queue: offer "a","b" then poll once.
 *
 * Expected output:
 *   list=[apple, banana, cherry] size=3
 *   set={1, 2, 3}        (order may vary; just deduplicated)
 *   one=1
 *   two=2
 *   three=3              (key order may vary)
 *   pop=3 peek=2
 *   poll=a
 *
 * Run:
 *   java src/10-collections/Main.java
 */
public class Main {
  public static void main(String[] args) {
    // your code here
  }
}
