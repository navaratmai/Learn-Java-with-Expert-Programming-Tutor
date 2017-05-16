package homeworkdate5;

import java.util.Scanner;

public class P166_16
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Plase input number a : ");
		a = sc.nextInt();
		System.out.print("Plase input number b : ");
		b = sc.nextInt();
		System.out.print("Plase input number c : ");
		c = sc.nextInt();
		if(a == b)
		{
			System.out.println("a = b");
					
		}
		else if(b == c)
		{
			System.out.println("b = c");
		}
		else if(a == c)
		{
			System.out.println("a = c");
		}
		else
		{
			System.out.println("ไม่มีจำนวนเท่ากัน ");
		}
	}

}
