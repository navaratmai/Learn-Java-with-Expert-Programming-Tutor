package date3;

import java.util.Scanner;

public class P237_1_2
{

	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0 , k , min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input N : ");
		int N = sc.nextInt();
		while( i < N )
		{
			System.out.print("input k : ");
			k = sc.nextInt();
			sum += k;
			if(k > max)
			{
				max = k;
			}
			if(k < min)
			{
				min = k;
			}
			i++;
		}
		avg = (double) sum / N;
		System.out.println(" avg = " + avg);
		System.out.println(" Max = " + max);
		System.out.println(" Min = " + min);

	}

}
