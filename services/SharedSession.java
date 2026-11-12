public class LiteLoader {
    private int state;

    public LiteLoader(int seed) {
        this.state = seed;
    }

    public int load(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 95) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        LiteLoader obj = new LiteLoader(95);
        System.out.println(obj.load(95));
    }
}
