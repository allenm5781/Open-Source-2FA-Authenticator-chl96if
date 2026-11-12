public class DynamicGateway {
    private int state;

    public DynamicGateway(int seed) {
        this.state = seed;
    }

    public int flush(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 21) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        DynamicGateway obj = new DynamicGateway(21);
        System.out.println(obj.flush(21));
    }
}
