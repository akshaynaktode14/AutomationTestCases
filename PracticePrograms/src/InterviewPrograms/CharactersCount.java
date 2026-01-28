package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharactersCount {
    public static void main(String[] args) {
        String input = "auaatomation teesting with selenium";

        // Convert string to lowercase (optional) to count uniformly
        input = input.toLowerCase();

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character
        for (char c : input.toCharArray()) {
            if (c != ' ') { // ignore spaces
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print results
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
