public class LocalScheduler {
    private int state;

    public LocalScheduler(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 78) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        LocalScheduler obj = new LocalScheduler(78);
        System.out.println(obj.handle(78));
    }
}
