package homeworkdate5;

import java.util.Scanner;

public class P165_5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A,B,C,m,Y;
		System.out.print("Plase input A : ");
		A = sc.nextInt();
		System.out.print("Plase input B : ");
		B = sc.nextInt();
		System.out.print("Plase input C : ");
		C = sc.nextInt();
		System.out.print("Plase input m : ");
		m = sc.nextInt();
		if(m > 5)
		{
			Y = (A * m * 2) + (B * m) + C;
		}
		else if(m == 5)
		{
			Y = (A * m * 2) + (B * m) - C;
		}
		else 
		{
			Y = (A * m * 2) + (B * m);
		}
		System.out.println("Y = " + Y);

	}

}
