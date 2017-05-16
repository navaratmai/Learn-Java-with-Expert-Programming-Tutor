package homeworkdate7;

import java.util.Scanner;

public class P174_7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int max = Integer.MIN_VALUE;
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("Please input number ");
			n = sc.nextInt();
			if(max < n)
			{
				max = n;
			}
		}
		System.out.println("max : " + max);

	}

}
