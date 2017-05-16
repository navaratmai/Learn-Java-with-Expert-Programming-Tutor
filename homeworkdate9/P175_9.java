package homeworkdate9;

import java.util.Scanner;

public class P175_9
{

	public static void main(String[] args)
	{
		double n;
		double sum = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plaeas input 5 number : ");
		for(int i = 0; i < 5; i++)
		{
			n = sc.nextDouble();
			sum = sum + n;
		}
		avg = sum/5;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
