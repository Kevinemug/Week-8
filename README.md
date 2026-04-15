# Week 8 — Generic Programming in Java (Group Exercise)


## How to work (Group format)
**Group size:** 3–5  
**Suggested roles:**
- Driver (types code)
- Navigator (design + correctness)
- Tester (writes demo / tests)
- Reviewer (checks for warnings, raw types)
- Presenter (summarizes solution)

**Rules:**
- Do not use raw types (e.g., `List list`, `Box box`)
- Avoid casts unless the question explicitly asks why they are dangerous
- Keep code compiling with no warnings if possible

---

## Questions (Improve the code using generics)

### Q1) Refactor a “raw” container into `Box<T>`
**Task:** This code compiles but is unsafe. Redesign it as a generic `Box<T>` so no casts are needed and wrong types are rejected at compile time.

```java
class Box {
    private Object value;

    public void put(Object v) { value = v; }
    public Object get() { return value; }
}

class Demo {
    public static void main(String[] args) {
        Box b = new Box();
        b.put("hello");
        Integer x = (Integer) b.get(); // runtime crash
    }
}
```

**Deliverable:** `Box<T>` implementation + demo for `Box<String>` and `Box<Integer>`.

---

### Q2) Improve a factory method using a generic method (`<T>`)
**Task:** Rewrite `makeBox` so callers get a `Box<T>` via type inference, with no casting.

```java
class Boxes {
    static Box makeBox(Object value) {
        Box b = new Box();
        b.put(value);
        return b;
    }
}

// usage:
Box b = Boxes.makeBox(123);
Integer n = (Integer) b.get(); // cast required
```

**Deliverable:** `static <T> Box<T> of(T value)` + demo calls.

---

### Q3) Replace “two-Object” pairing with `Pair<A,B>`
**Task:** Refactor this `Pair` into a generic `Pair<A, B>` and update usage to remove casts and prevent bugs.

```java
class Pair {
    public final Object first;
    public final Object second;

    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }
}

class Demo {
    public static void main(String[] args) {
        Pair p = new Pair("age", 20);
        String key = (String) p.first;
        String value = (String) p.second; // bug: should be Integer
    }
}
```

**Deliverable:** immutable `Pair<A,B>` + two examples of usage.

---

### Q4) Add a bound to fix a “max” method
**Task:** This method does not compile. Fix it using a bounded type parameter and explain why the bound is necessary.

```java
class Utils {
    static <T> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b; // compile error
    }
}
```

**Deliverable:** `static <T extends Comparable<T>> T max(T a, T b)` + demo.

---

### Q5) Fix wildcard misuse (PECS) in list utilities
**Task:** The intent is (a) sum any numbers and (b) add integers into a broader list, but these signatures are wrong. Correct them using `? extends` and `? super`, and state what operations become legal/illegal.

```java
import java.util.*;

class ListUtils {
    static double sum(List<Number> nums) { // too strict
        double s = 0;
        for (Number n : nums) s += n.doubleValue();
        return s;
    }

    static void addAllIntegers(List<? extends Integer> target, List<Integer> values) {
        for (Integer v : values) target.add(v); // compile error
    }
}
```

**Deliverable:** corrected method signatures + small demo in `main`.

---

## Submission checklist
- [ ] All code compiles
- [ ] No raw types used
- [ ] No unnecessary casts
- [ ] Q4 uses a correct bound
- [ ] Q5 demonstrates PECS understanding

---

## Optional challenge
- Implement: `static <T> void swap(List<T> list, int i, int j)`
- Write a short note explaining **type erasure** (2–5 sentences)
