public class HybridWorker {
    private int state;

    public HybridWorker(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 97) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        HybridWorker obj = new HybridWorker(97);
        System.out.println(obj.handle(97));
    }
}
