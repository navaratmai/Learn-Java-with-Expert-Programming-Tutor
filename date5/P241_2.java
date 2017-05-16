package date5;

import java.util.Scanner;

public class P241_2
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
		int v;
		int count = 0;
		System.out.print("input v : ");
		v = sc.nextInt();
		for (int i = 0; i < x.length; i++)
		{
			if(x[i] == v)
			{
				count++;
				break;
			}
		}
		if (count == 0)
		{
			System.out.println("Is not in array");
		}
		else
		{
			System.out.println("Is in array");
		}

	}

}
