public class SmartProcessor {
    private int state;

    public SmartProcessor(int seed) {
        this.state = seed;
    }

    public int flush(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 77) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SmartProcessor obj = new SmartProcessor(77);
        System.out.println(obj.flush(77));
    }
}
