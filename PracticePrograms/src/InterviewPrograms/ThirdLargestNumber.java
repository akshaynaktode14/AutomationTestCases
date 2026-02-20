package InterviewPrograms;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a ak akswsedw aksh aksha akshay";
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
			System.out.println("Third largest word is "+ words[words.length-4]);
		}
		else {
			System.out.println("Not enought words");
		}
	}

}
