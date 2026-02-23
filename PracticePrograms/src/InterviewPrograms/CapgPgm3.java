package InterviewPrograms;

public class CapgPgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a1b3c4a1g7f4"; //abbbcccca
		for(int i=0;i<str.length()-1;i+=2) {
			char ch=str.charAt(i);
			int count=str.charAt(i+1)-'0';
			for(int j=0;j<count;j++) {
				System.out.print(ch);
			}
		}
	}

}
