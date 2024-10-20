import java.util.Arrays;

public class Assignment4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                findThreeNumbersClosestToPowerOfTwo(new int[]{23, 56, 22, 11, 65, 89, 3, 44, 87, 910, 45, 35, 98})
        ));
    }

    private static int[] findThreeNumbersClosestToPowerOfTwo(int[] numbers) {
        int n = numbers.length;
        if (n < 3) return null;
        int closestSum = numbers[0] + numbers[1] + numbers[2];
        int[] result = new int[4];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = numbers[i] + numbers[j] + numbers[k];
                    int power = closestPowerOfTwo(sum);

                    if (Math.abs(sum - power) < Math.abs(closestSum - closestPowerOfTwo(closestSum))) {
                        closestSum = sum;
                        result[0] = numbers[i];
                        result[1] = numbers[j];
                        result[2] = numbers[k];
                        result[3] = power;
                    }
                }
            }
        }

        return result;
    }

    private static int closestPowerOfTwo(int sum) {
        int power = 1;
        while (power < sum) {
            power *= 2;
        }

        return (power - sum < sum - power / 2) ? power : power / 2;
    }
}
