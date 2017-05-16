package homework;

import java.util.Scanner;

public class P175_11
{

	public static void main(String[] args)
	{
		int sum = 0;
		int sumnega = 0;
		int count = 0, countnega = 0;
		int n;
		double avg,avgnega;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Please input number : ");
			n = sc.nextInt();
			if(n == 0)
			{
				break;
			}
			else if(n > 0)
			{
				sum = sum+n;
				count++;
			}
			else if(n < 0)
			{
				sumnega = sumnega + n;
				countnega++;
			}	
		}
		avg = sum/count;
		avgnega = sumnega/countnega;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.println("sumnega : " + sumnega);
		System.out.println("avgnega : " + avgnega);

	}

}
