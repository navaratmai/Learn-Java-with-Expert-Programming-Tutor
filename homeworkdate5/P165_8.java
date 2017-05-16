package homeworkdate5;

import java.util.Scanner;

public class P165_8
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Plase input a : ");
		a = sc.nextInt();
		if(a % 2 == 0)
		{
			System.out.println(" เป็นเลขคู่ ");
		}
		else
		{
			System.out.println(" เป็นเลขคี่ ");
		}

	}

}
