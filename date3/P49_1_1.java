package date3;

import java.util.Scanner;

public class P49_1_1
{

	public static void main(String[] args)
	{
		System.out.println("Please input");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n;
		n = sc.nextInt();
		
		int i = 1 ;
		while( i <= n)
		{
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}
