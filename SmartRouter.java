public class HybridController {
    private int state;

    public HybridController(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 56) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        HybridController obj = new HybridController(56);
        System.out.println(obj.dispatch(56));
    }
}
