package date4;

import java.util.Scanner;

public class P55_9
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int [10];
		for(int i = 0; i < x.length; i++)
		{
			System.out.println("Pleas input a number : ");
			x[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<x.length;i++)
		{
			if(x[i]>max)//(max < x[i]
			{
				max = x[i];
			}
		}
		System.out.println(max);

	}

}
