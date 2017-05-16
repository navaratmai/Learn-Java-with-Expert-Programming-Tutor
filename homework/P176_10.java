package homework;

import java.util.Scanner;

public class P176_10
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, sum =0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double avg;
		
		System.out.println("Please input 10 number : ");
		for(int i = 0; i < 10; i++)
		{
			n = sc.nextInt();
			sum = sum + n;
			if(max < n)
			{
				max = n;
			}
			if(min > n)
			{
				min = n;
			}
		}
		avg = sum/10;
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("avg : " + avg);

	}

}
