package homeworkdate5;

import java.util.Scanner;

public class P166_10
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		double e;
		System.out.print("Plase input a : ");
		a = sc.nextInt();
		System.out.print("Plase input b : ");
		b = sc.nextInt();
		System.out.print("Plase input c : ");
		c = sc.nextInt();
		if(c == 1)
		{
			d = a + b;
			System.out.println(" a + b = " + d);
		}
		else if(c == 2)
		{
			d = a - b;
			System.out.println(" a - b = " + d);
		}
		else if(c == 3)
		{
			d = a * b;
			System.out.println(" a * b = " + d);
		}
		else if(c == 4)
		{
			e = (double)a / b;
			System.out.println(" a / b = " + e);
		}

	}

}
