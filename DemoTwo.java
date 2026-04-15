class Pair <T,U> {
    public final T first;
    public final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}

class DemoTwo {
    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair<>("age", 20);
        String key =  p.first;
        Integer value = p.second; 

        System.out.println(key + value);
    }
}