package InterviewPrograms;

public class SearchStringValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = { "abc", "xyz", "pqr", "mno","xyz", "zyx" };
		String search_String = "xyz";
		boolean flag = false;
		int count=0;
		for (String s : a)
		{
		if (search_String == s)
		{
		System.out.println("Element found");
		flag = true;
		//break;
		++count;
		}
		}
		System.out.println(search_String + " is found "+count+" times");
		if (flag == false)
		{
		System.out.println("Element NOT found");
		}
//		
//		int a[] = { 10, 20, 30, 40, 50 };
//		int num = 30;
//		boolean flag = false;
//		for (int i : a)
//		{
//		if (num == i)
//		{
//		System.out.println("Element found");
//		flag = true;
//		break;
//		}
//		}
//		if (flag == false)
//		{
//		System.out.println("Element NOT found");
//		}

	}

}
