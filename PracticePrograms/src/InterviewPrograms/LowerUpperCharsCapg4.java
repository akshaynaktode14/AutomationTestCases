package InterviewPrograms;

public class LowerUpperCharsCapg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HeLlo WoRLd akshay";
		StringBuilder result= new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
//			if(ch>='A'&& ch<='Z') {
//				result.append((char)(ch+32));
//			}else if(ch>='a'&& ch<='z') {
//				result.append((char)(ch-32));
//			}
			if(Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
			}else if(Character.isUpperCase(ch)) {
				result.append(Character.toLowerCase(ch));
			}
			else {
				result.append(ch);
			}
		}
		System.out.println(result.toString());

	}

}
