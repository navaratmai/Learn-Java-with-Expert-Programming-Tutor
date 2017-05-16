package date3;

import java.util.Scanner;

public class P49_1_3
{

	public static void main(String[] args)
	{
		System.out.println("Please input");
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		double sum = 0;
		int i = 1 ;
		while( i <= n)
		{
			sum = sum + 1.0/i;
			i++;
		}
		System.out.println(sum);

	}

}
