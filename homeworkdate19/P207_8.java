package homeworkdate19;

import java.util.Scanner;

public class P207_8
{

	public static void main(String[] args)
	{
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input Srting : ");
		a = sc.nextLine();
		System.out.println(del(a));
		System.out.println(delete(a));
	}
	public static String del(String a)
	{
		return a.substring(0, a.length()-1);
	}
	public static String delete(String a)
	{
		return a.substring(1, a.length());
	}

}
