package date3;

import java.util.Scanner;

public class P50_2
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
		System.out.println(count);

	}

}
