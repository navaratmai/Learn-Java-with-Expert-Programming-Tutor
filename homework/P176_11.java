 package homework;

import java.util.Scanner;

public class P176_11
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m,n, sum =0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double avg;
		
		System.out.println("Please input number");
		m = sc.nextInt();
		System.out.println("Please input " + m + " number : ");
		for(int i = 0; i < m; i++)
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
		avg = sum/m;
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("avg : " + avg);

	}

}
