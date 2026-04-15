# Week 8 — Generic Programming in Java (Group Exercise)


## How to work (Group format)
**Group size:** 3-4 
**Time:** 1h

**Goal:**
- Do not use raw types (e.g., `List list`, `Box box`)
- Avoid casts unless the question explicitly asks why they are dangerous
- Keep code compiling with no warnings if possible

---

## Questions (Improve the code using generics)

### Q1) Refactor a “raw” container into `Envelope<T>`
**Task:** This code compiles but is unsafe. Redesign it as a generic `Envelope<T>` so no casts are needed and wrong types are rejected at compile time.

```java
class Envelope {
    private Object value;

    public void put(Object v) { value = v; }
    public Object get() { return value; }
}

class Demo {
    public static void main(String[] args) {
        Envelope e = new Envelope();
        e.put("hello");
        Integer x = (Integer) e.get(); 
    }
}
```
---

### Q2) Replace “two-Object” pairing with `Pair<A,B>`
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
        String value = (String) p.second; 
    }
}
```


---

### Q3) Fix wildcard misuse in list utilities
**Task:** How can you fix these two method signatures using ```? extends``` (so you can sum/read any kind of Number) and ```? super``` (so you can safely add Integers into a wider list), and after fixing them, what actions are allowed and not allowed inside each method?.

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

---

## Submission checklist
- [ ] All code compiles
- [ ] No raw types used
- [ ] No unnecessary casts
---


