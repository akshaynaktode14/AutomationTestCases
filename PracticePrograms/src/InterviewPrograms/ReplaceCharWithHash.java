package InterviewPrograms;

public class ReplaceCharWithHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="akoshoyomo";
		StringBuilder output= new StringBuilder();
		int count=0;
		for(char ch:str.toCharArray()) {
			if(ch=='o') {
				count++;
				output.append("#".repeat(count));
			}
			else {
				output.append(ch);
			}
		}
		System.out.println("Original String "+ str);
		System.out.println("ReplaceWithHash "+ output);
	}

}
