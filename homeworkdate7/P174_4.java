package homeworkdate7;

import java.util.Scanner;

public class P174_4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 1;
		System.out.print("Please input number : ");
		n = sc.nextInt();
		for(int i = 1 ; i <= 12; i++)
		{
			
			System.out.println(n + " * " + i + " = " + (n*i));
		}

	}

}
