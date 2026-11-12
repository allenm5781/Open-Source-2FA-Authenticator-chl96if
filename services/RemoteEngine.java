public class LocalHandler {
    private int state;

    public LocalHandler(int seed) {
        this.state = seed;
    }

    public int load(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 34) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        LocalHandler obj = new LocalHandler(34);
        System.out.println(obj.load(34));
    }
}
