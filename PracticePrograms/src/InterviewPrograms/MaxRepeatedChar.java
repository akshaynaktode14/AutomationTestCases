package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedChar {
    public static void main(String[] args) {
        String sentence = "Java is java again java again";
        sentence = sentence.replaceAll("\\s+", ""); // Remove spaces

        Map<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character
        for (char ch : sentence.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find character with max frequency
        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most repeated character: '" + maxChar + "' occurred " + maxCount + " times.");
    }
}
