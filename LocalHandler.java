public class SecureSession {
    private int state;

    public SecureSession(int seed) {
        this.state = seed;
    }

    public int fetch(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 30) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        SecureSession obj = new SecureSession(30);
        System.out.println(obj.fetch(30));
    }
}
