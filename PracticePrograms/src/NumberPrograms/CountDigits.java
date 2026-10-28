package NumberPrograms;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=23;
int originalN=n;
int count=0;
while(n>0) {
	int rem=n%10;
	if(rem>0 && originalN%rem==0) {
		count++;
	}
	n=n/10;
}
if(count>0) {
System.out.println(count);
}
else {
	System.out.println(count);
}
	}

}
