public class HybridClient {
    private int state;

    public HybridClient(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 66) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        HybridClient obj = new HybridClient(66);
        System.out.println(obj.decode(66));
    }
}
