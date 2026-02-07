package InterviewPrograms;

public class ReverseStringCapG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "my name is Akshay";

        // Remove spaces
        String noSpaces = input.replaceAll("\\s+", "");

        StringBuilder reversed = new StringBuilder();
        for (int i = noSpaces.length() - 1; i >= 0; i--) {
            reversed.append(noSpaces.charAt(i));
            if (i == noSpaces.length() - 1 || i == noSpaces.length() - 3) {
            	reversed.append(" ");
            }
        }

        System.out.println("Input  : " + input);
        System.out.println("Output : " + reversed.toString());
	}

}
