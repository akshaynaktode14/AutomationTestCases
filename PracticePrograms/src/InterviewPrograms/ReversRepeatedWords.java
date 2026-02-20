package InterviewPrograms;

public class ReversRepeatedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="THE is java is easy amd and java is powerful language amd";
		System.out.println(str);
		String[] words=str.split(" ");
		/* //if 1st occurences want to reverse
		for(int i=0;i<words.length;i++) {
			int count=0;
			for(int j=0;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
				}
			}
				if(count>1) {
					words[i]=new StringBuilder(words[i]).reverse().toString();
			}
		}
		for(String word:words) {
			System.out.print(word+" ");
		}*/
		
		//If you want to reverse all repeated words
		boolean [] repeated = new boolean[words.length];
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					repeated[i]=true;
					repeated[j]=true;
				}
			}
			}
		for(int i=0;i<words.length;i++) {
			if(repeated[i]) {
				words[i]=new StringBuilder(words[i]).reverse().toString();
			}
		}
		System.out.println(String.join(" ", words));
		
	}

}
