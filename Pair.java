class Pair<A, B> {
    public final A first;
    public final B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }
}

class Demo {
    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair("age", 20);
        String key = p.first;
        Integer value = p.second;
        System.out.println(key + ": " + value);
         
    }
}
