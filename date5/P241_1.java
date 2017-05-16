package date5;

import java.util.Scanner;

public class P241_1
{

	public static void main(String[] args)
	{
		int []x = new int [10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < x.length; i++)
		{
			System.out.print("input : ");
			x[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < x.length; i++)
		{
			if(x[i] >= 10)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
