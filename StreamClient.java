public class HybridScheduler {
    private int state;

    public HybridScheduler(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 52) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        HybridScheduler obj = new HybridScheduler(52);
        System.out.println(obj.collect(52));
    }
}
