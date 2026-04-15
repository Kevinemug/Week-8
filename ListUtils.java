import java.util.*;

class ListUtils {
    static double sum(List<? extends  Number> nums) { // too strict
        double s = 0;
        for (Number n : nums) s += n.doubleValue();
        return s;
    }

    static void addAllIntegers(List<? super Integer> target, List<Integer> values) {
        for (Integer v : values) target.add(v); // compile error
    }
}