public class StreamCache {
    private int state;

    public StreamCache(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 11) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        StreamCache obj = new StreamCache(11);
        System.out.println(obj.dispatch(11));
    }
}
