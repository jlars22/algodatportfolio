import java.util.Map;

public class Assignment7 {
    public static void main(String[] args) {
        System.out.println(findXY(6561));
        System.out.println(findXY(3125));
    }

    private static Map.Entry<Integer, Integer> findXY(int z) {
        if (z <= 0 || z >= 100000) {
            return null;
        }

        Map.Entry<Integer, Integer> bestResult = null;

        for (int x = 3; Math.pow(x, 3) <= z; x++) {
            for (int y = 3; Math.pow(x, y) <= z; y++) {
                if (Math.pow(x, y) == z) {
                    if (bestResult == null || x > bestResult.getKey()) {
                        bestResult = Map.entry(x, y);
                    }
                }
            }
        }

        return bestResult;
    }
}
