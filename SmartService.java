public class CoreRegistry {
    private int state;

    public CoreRegistry(int seed) {
        this.state = seed;
    }

    public int collect(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 73) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        CoreRegistry obj = new CoreRegistry(73);
        System.out.println(obj.collect(73));
    }
}
