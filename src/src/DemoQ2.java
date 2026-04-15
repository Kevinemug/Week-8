record Pair<A,B> (A first, B second) { }

class DemoQ2 {
    public static void main(String[] args) {
        Pair<String, String> p = new Pair<>("age", "20");
        String key = p.first();
        String value = p.second();
    }
}