public class Assignment6 {
    public static void main(String[] args) {
        System.out.println(sumDivisibleBy3(12));
        System.out.println(sumDivisibleBy3(14));
    }

    private static int sumDivisibleBy3(int n) {
        if (n <= 0) {
            return 0;
        }

        while (n % 3 != 0) {
            n--;
        }

        return n + sumDivisibleBy3(n - 1);
    }
}
