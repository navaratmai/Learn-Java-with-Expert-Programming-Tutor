package homeworkdate5;

import java.util.Scanner;

public class P171_6
{
	public static void main(String[] args)
	{
		int num,a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input num : ");
		num = sc.nextInt();
		int []x = new int[num];
		for(int i = 0; i < x.length; i++)
		{
			System.out.print("Please input number : ");
			a = sc.nextInt();
			x[i] = a;
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<x.length;i++)
		{
			if(x[i]<min)
			{
				min = x[i];
			}
		}int max = Integer.MIN_VALUE;
		for(int i = 0;i<x.length;i++)
		{
			if(x[i]>max)//(max < x[i]
			{
				max = x[i];
			}
		}
		int sum = 0;
		double avg = 0.0;
		for(int i = 0;i<x.length;i++)
		{
			sum = sum + x[i];
		}
		avg = (double)sum / x.length;
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
		System.out.println("Avg = " + avg);
	}

}
