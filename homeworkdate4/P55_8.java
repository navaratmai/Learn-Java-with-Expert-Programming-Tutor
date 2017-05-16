package homeworkdate4;

import java.util.Scanner;

public class P55_8
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []x = new int [10];
		for(int i = 0; i < x.length; i++)
		{
			System.out.print("Pleas input a number : ");
			x[i] = sc.nextInt();
		}
		int sum = 0;
		double avg = 0.0;
		for(int i = 0;i<x.length;i++)
		{
			sum = sum + x[i];
		}
		avg = (double)sum / x.length;
		System.out.println(sum);
		System.out.println(avg);

	}

}
