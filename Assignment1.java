public class Assignment1 {
    public static void main(String[] args) {
        System.out.println(sumOddSquares(8));
    }

    private static int sumOddSquares(int n) {
        if (n <= 0) return 0;

        if (n % 2 == 0) n--;

        return n * n + sumOddSquares(n - 1);
    }
}
