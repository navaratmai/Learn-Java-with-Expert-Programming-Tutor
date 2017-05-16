package homeworkdate5;

import java.util.Scanner;

public class P166_13
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		double b,c,d;
		System.out.print("Plase input number 1-3 : ");
		a = sc.nextInt();
		if(a > 3)
		{
			System.out.print(" เลือก 1 ถึง 3 เท่านั้น : ");
			a = sc.nextInt();
			if(a < 1)
			{
				System.out.print(" เลือก 1 ถึง 3 เท่านั้น : ");
				a = sc.nextInt();
			}
		}
		if(a == 1)
		{
			System.out.print(" ใส่เลข ทศนิยม 1 : ");
			b = sc.nextDouble();
			System.out.print(" ใส่เลข ทศนิยม 2 : ");
			c = sc.nextDouble();
			d = b + c;
		}
		else if(a == 2)
		{
			System.out.print(" ใส่เลข ทศนิยม 1 : ");
			b = sc.nextDouble();
			System.out.print(" ใส่เลข ทศนิยม 2 : ");
			c = sc.nextDouble();
			d = b * c;
		}
		else
		{
			System.out.print(" ใส่เลข ทศนิยม 1 : ");
			b = sc.nextDouble();
			System.out.print(" ใส่เลข ทศนิยม 2 : ");
			c = sc.nextDouble();
			d = b / c;
		}
		System.out.println( d );
		
		

	}

}
