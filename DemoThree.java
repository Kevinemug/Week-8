import java.util.*;

class ListUtils {

  
    static <T extends Number> double sum(List<T> nums) { // too strict
        double s = 0;
        for (T n : nums) s += n.doubleValue();
        return s;
    }

    
    static void addAllIntegers(List<? super Integer> target, List<? extends Integer> values) {
        for (Integer v : values) target.add(v); // compile error
    }
}

class DemoThree {
    public static void main(String[] args) {

    }
}