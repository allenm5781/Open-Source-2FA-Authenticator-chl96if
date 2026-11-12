public class SmartRouter {
    private int state;

    public SmartRouter(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 49) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SmartRouter obj = new SmartRouter(49);
        System.out.println(obj.decode(49));
    }
}
