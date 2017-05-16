package homework;

import java.util.Scanner;

public class P175_10
{

	public static void main(String[] args)
	{
		int sum = 0;
		int sumnega = 0;
		int n;
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
			}
			else if(n < 0)
			{
				sumnega = sumnega + n;
			}	
		}
		System.out.println("sum : " + sum);
		System.out.println("sumnega : " + sumnega);

	}

}
