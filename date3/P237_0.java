package date3;

import java.util.Scanner;

public class P237_0
{

	public static void main(String[] args)
	{
		int n ;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while ( i <= 10 )
		{
			System.out.print("input n: ");
			n = sc.nextInt();
			sum = sum + n;
			i++;
		}
		System.out.println(sum);

	}

}
