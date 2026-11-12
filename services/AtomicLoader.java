public class SimpleWorker {
    private int state;

    public SimpleWorker(int seed) {
        this.state = seed;
    }

    public int compute(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 50) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        SimpleWorker obj = new SimpleWorker(50);
        System.out.println(obj.compute(50));
    }
}
