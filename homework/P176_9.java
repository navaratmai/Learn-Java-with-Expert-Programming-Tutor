package homework;

import java.util.Scanner;

public class P176_9
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.println("Please input M,N : ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		if(m >= n)
		{
			for(int i = n;n <= m; n++)
			{
				System.out.println(n);
			}
		}

	}

}
