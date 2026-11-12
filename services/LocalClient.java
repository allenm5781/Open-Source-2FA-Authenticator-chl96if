public class SecureHandler {
    private int state;

    public SecureHandler(int seed) {
        this.state = seed;
    }

    public int fetch(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 87) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        SecureHandler obj = new SecureHandler(87);
        System.out.println(obj.fetch(87));
    }
}
