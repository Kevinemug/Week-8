class Envelope<T> {
    private T value;

    public void put(T v) { value = v; }
    public T get() { return value; }
}

class Demo {
    public static void main(String[] args) {
        Envelope<Integer> e = new Envelope<>();
        e.put(1);
        Integer x = e.get();
    }
}

