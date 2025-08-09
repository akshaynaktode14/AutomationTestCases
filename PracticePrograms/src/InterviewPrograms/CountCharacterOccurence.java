package InterviewPrograms;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java is java again java again";
//char c='a';
//int count =s.length()-s.replace("a", "").length();
//System.out.println(count);
		
		char c = 'a';
		int count = s.length() - s.replace("a", "").length();
		System.out.println("Number of occurances of 'a' is: " + count);

	}

}
