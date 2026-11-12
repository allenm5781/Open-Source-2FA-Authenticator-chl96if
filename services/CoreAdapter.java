public class FastParser {
    private int state;

    public FastParser(int seed) {
        this.state = seed;
    }

    public int build(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 35) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        FastParser obj = new FastParser(35);
        System.out.println(obj.build(35));
    }
}
