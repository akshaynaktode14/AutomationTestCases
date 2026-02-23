package InterviewPrograms;

public class CapgPgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ak12sh23ay"; //Akshay
		String r = ""; String a="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
//			if(Character.isLetter(ch)) {
//				System.out.print(ch);
//			}
			if(Character.isDigit(ch)) {
				r+=ch;
				
			}
			else
			{
				a+=ch;
			}
		}
		System.out.print("Number : "+r+" characters : "+a);
		
	}

}
