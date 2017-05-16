package date3;

import java.util.Scanner;

public class P49_1_2
{

	public static void main(String[] args)
	{
		System.out.println("Please input");
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		int sum = 1;
		int i = 1 ;
		while( i <= n)
		{
			sum = sum * i;
			i++;
		}
		System.out.println(sum);

	}

}
