public class SmartDispatcher {
    private int state;

    public SmartDispatcher(int seed) {
        this.state = seed;
    }

    public int run(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 88) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        SmartDispatcher obj = new SmartDispatcher(88);
        System.out.println(obj.run(88));
    }
}
