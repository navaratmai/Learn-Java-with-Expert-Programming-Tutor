package date4;

import java.util.Scanner;

public class P237_5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Plase input number");
		int n = sc.nextInt();
		int i = 0;
		while( i < n)
		{
			int j = 0;
			while( j < n-i )
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
