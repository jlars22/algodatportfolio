import java.util.HashMap;
import java.util.Map;

public class Assignment11 {
    public static void main(String[] args) {
        int[] votes = new int[]{7, 4, 3, 5, 3, 1, 6, 4, 5, 1, 7, 5};
        System.out.println(getMajorityVote(votes));
    }

    private static int getMajorityVote(int[] votes) {
        int threshold = votes.length / 2;

        Map<Integer, Integer> voteMap = new HashMap<>();

        for (int vote : votes) {
            if (!voteMap.containsKey(vote)) {
                voteMap.put(vote, 1);
            } else {
                voteMap.put(vote, (voteMap.get(vote) + 1));
            }
        }

        for (Map.Entry<Integer, Integer> entry : voteMap.entrySet()) {
            if (entry.getValue() > threshold) return entry.getKey();
        }

        return -1;
    }
}
