package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class CharactersCount {
    public static void main(String[] args) {
        String input = "auaatomation teesting with selenium";

        Map<Character, Integer> counts = new HashMap<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (c != ' ') { // skip spaces
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        }

        counts.forEach((ch, count) -> System.out.println(ch + " : " + count));
    }
}