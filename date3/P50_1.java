package date3;

import java.util.Scanner;

public class P50_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Please input");
		a = sc.nextInt();
		int k = 1;
		while (k < a)
		{
			if (a % k == 0)
			{
				System.out.println(k);
			}
			k++;
		}

	}

}
