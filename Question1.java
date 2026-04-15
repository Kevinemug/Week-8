class Demo {
    public static void main(String[] args) {
        Envelope<String> e = new Envelope<>();
        e.put("Hello");
        Envelope<Number> b = new Envelope<>();
       b.put(123);
        System.out.println(b.get());
    }
}

class Envelope<T> {
    private T value;

    public void put(T V) { 
        value = V;
        }
    public T get() {
        return value;
        }
}

