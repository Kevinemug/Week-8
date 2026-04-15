import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    static double sum(List<? extends Number> nums) { // too strict
        double s = 0;
        for (Number n : nums) s += n.doubleValue();
        return s;
    }

    static void addAllIntegers(List<? super Integer> target, List<Integer> values) {
        List<Integer> valuesCopy = new ArrayList<>(values);
        for (Integer v : valuesCopy) {
            target.add(v);
        }
    }

    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(2);
        list.add(2.5);
        System.out.println(sum(list));
        list2.add(1);
        list2.add(2);
        addAllIntegers(list2, list2);
        System.out.println(list2.size());
    }
}
