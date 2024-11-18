import java.util.HashMap;
import java.util.Map;

public class Opgave1 {
    public static void main(String[] args) {
        String test = "The cattle were running back and forth, but there was no wolf to be seen, heard, or smelled, so the shepherd decided to take a little nap in a bed of grass and early summer flowers. Soon he was awakened by a sound he had never heard before.";
        System.out.println(getMostOccurringWord(test));
    }

    private static String getMostOccurringWord(String input) {
        input = input.toUpperCase();
        input = input.replace(",", "");
        input = input.replace(".", "");

        String[] words = input.split(" ");

        Map<String, Integer> wordMap = new HashMap<>();
        int highestOccurance = 0;
        String highestOccuranceWord = "";

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                int newValue = wordMap.get(word) + 1;
                wordMap.put(word, newValue);

                if (newValue > highestOccurance) {
                    highestOccuranceWord = word;
                    highestOccurance = newValue;
                }
            } else {
                wordMap.put(word, 1);
            }
        }
        System.out.println(wordMap);
        return highestOccuranceWord;
    }
}