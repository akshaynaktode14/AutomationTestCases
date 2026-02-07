package InterviewPrograms;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Akshay is a Selenium Automation Engineer";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].length()<words[j].length()) {
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		if(words.length>=3) {
			System.out.println("Third largest number is "+ words[2]);
		}
		else {
			System.out.println("Not enought words");
		}
	}

}
