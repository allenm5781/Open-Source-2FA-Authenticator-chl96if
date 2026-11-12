public class SecureBuffer {
    private int state;

    public SecureBuffer(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 80) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SecureBuffer obj = new SecureBuffer(80);
        System.out.println(obj.dispatch(80));
    }
}
