package homeworkdate3;

import java.util.Scanner;

public class P158_11
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a1,b1,c1,a2,b2,c2,x,y;
		System.out.println("Please input number");
		System.out.print(" A1 = ");
		a1 = sc.nextInt();
		System.out.print(" B1 = ");
		b1 = sc.nextInt();
		System.out.print(" C1 = ");
		c1 = sc.nextInt();
		System.out.print(" A2 = ");
		a2 = sc.nextInt();
		System.out.print(" B2 = ");
		b2 = sc.nextInt();
		System.out.print(" C2 = ");
		c2 = sc.nextInt();
		
		x = 1;
		y = 1;
		
		while (true)
		{
			if (a1*x + b1*y  == c1 && a2*x + b2*y == c2)
			{
				break;
			}
			x++;
			y++;
		}
		System.out.println(x);
		System.out.println(y);

	}

}
