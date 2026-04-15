class Envelope<T> {
    
    private T value;
    public void put(T v) { value = v; }
    public T get() { return value; }
}

class Demo {
    public static void main(String[] args) {
        Envelope<String> e = new Envelope<>();
        e.put("hello");
        String x =  e.get(); 
        System.out.println(x);
    }
}
