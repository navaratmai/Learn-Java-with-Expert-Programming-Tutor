package homeworkdate3;

import java.util.Scanner;

public class P49_1
{

	public static void main(String[] args)
	{
		int x , y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input 2 number");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x < y )
		{
			System.out.println(y);
		}
		else if(x == y)
		{
			System.out.println("เท่ากัน");
		}
		else
		{
			System.out.println(x);
		}

	}

}
