public class LocalCache {
    private int state;

    public LocalCache(int seed) {
        this.state = seed;
    }

    public int resolve(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 26) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        LocalCache obj = new LocalCache(26);
        System.out.println(obj.resolve(26));
    }
}
