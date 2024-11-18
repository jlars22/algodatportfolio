public class Assignment10 {
    public static void main(String[] args) {
        System.out.println(logTo(32));
        System.out.println(logTo(4096));
    }

    private static int logTo(int n) {
        if (n == 1) {
            return 0;
        }

        return 1 + logTo(n / 2);
    }
}
