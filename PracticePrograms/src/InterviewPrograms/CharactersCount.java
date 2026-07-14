package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine();

        Map<Character, Integer> counts = new HashMap<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (c != ' ') { // skip spaces
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        }

        counts.forEach((ch, count) -> System.out.println(ch + " : " + count));
        
//        for(Map.Entry<Character, Integer> entry : counts.entrySet()) {
//        	System.out.println(entry.getKey() + " : "+ entry.getValue());
//        }
    }
}