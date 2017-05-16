package date2;

import java.util.Scanner;

public class P234_7
{

	public static void main(String[] args)
	{
		double wA,pA,wB,pB,a,b;
		System.out.println("input weight , price of A");
		
		Scanner sc = new Scanner(System.in);
		
		wA = sc.nextDouble();
		pA = sc.nextDouble();
		
		System.out.println("input weight , price of B");
		
		wB = sc.nextDouble();
		pB = sc.nextDouble();
		
		a = wA / pA ;
		b = wB / pB ;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if(a > b)
		{
			System.out.println(" A ถูกว่า");
		}
		else if(a == b)
		{
			System.out.println(" เท่ากัน ");
		}
		else
		{
			System.out.println(" B ถูกกว่า ");
		}
		

	}

}
