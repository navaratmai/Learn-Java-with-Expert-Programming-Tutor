package date5;

import java.util.Scanner;

public class P241_3
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
		int max = Integer.MIN_VALUE;
		int max_index = 0;
		for (int i = 0; i < x.length; i++)
		{
			if(x[i] > max)
			{
				max = x[i];
				max_index = i;

			}
		}
		System.out.println("max = " + max + ", index " + max_index);

	}

}
