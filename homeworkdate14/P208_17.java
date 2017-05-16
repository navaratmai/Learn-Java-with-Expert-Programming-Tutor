package homeworkdate14;

import java.util.Scanner;

public class P208_17
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String text ;
		
		System.out.println("Please input message : ");
		text = sc.nextLine();
		
		System.out.println(count(text));
		

	}
	
	public static int count (String text)
	{
		int x = text.length();
		return x;
	}

}
