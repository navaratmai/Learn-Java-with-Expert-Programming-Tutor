package date3;

import java.util.Scanner;

public class P237_1
{

	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0 , n, min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		while( i < 10 )
		{
			System.out.print("input n : ");
			n = sc.nextInt();
			sum += n;
			if(n > max)
			{
				max = n;
			}
			if(n < min)
			{
				min = n;
			}
			i++;
		}
		avg = sum / 10.0;
		System.out.println(" avg = " + avg);
		System.out.println(" Max = " + max);
		System.out.println(" Min = " + min);

	}

}
