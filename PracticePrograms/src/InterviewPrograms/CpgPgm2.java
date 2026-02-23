package InterviewPrograms;

public class CpgPgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Welcome to Capgemeni Akshay";//Welcome to Capgemeni yahska
		
		String[] str1=str.split("\\s+");
		String reverseString="";
		String reverseWord = "";
		for(int i=0;i<str1.length;i++) {
			if(i==str1.length-1) {
				String word = str1[i];
				
				for (int j = word.length() - 1; j >= 0; j--)
				{
				reverseWord = reverseWord + word.charAt(j);
				}
			}
				else
				{
					reverseString+=str1[i]+" ";
				}
			}
		System.out.println(reverseString+reverseWord);
		}
	}

