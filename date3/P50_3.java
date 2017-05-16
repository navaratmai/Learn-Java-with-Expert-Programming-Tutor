package date3;

import java.util.Scanner;

public class P50_3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Please input");
		a = sc.nextInt();
		int count = 0;
		int k = 1;
		while (k <= a)
		{
			if (a % k == 0)
			{
				count++;
			}
			k++;
		}
		if (count == 2)
		{
			System.out.println(a + " is a prime");
		}
		else
		{
			System.out.println(a + " is not a prime");
		}

	}

}
