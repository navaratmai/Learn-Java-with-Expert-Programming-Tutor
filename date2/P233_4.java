package date2;

import java.util.Scanner;

public class P233_4
{

	public static void main(String[] args)
	{
		double R,p,l,A;
		
		p = 1.59e-8;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input Area And Length");
		A = sc.nextDouble();
		l = sc.nextDouble();
		
		R = (p*l)/A;
		
		System.out.println(R);

	}

}
