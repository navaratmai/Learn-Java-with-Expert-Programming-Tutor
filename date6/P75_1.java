package date6;

import java.util.Scanner;

public class P75_1
{
	public static double power(double x,int n)
	{
		double sum = 1;
		int i = n;
		while(i > 0)
		{
			if(i % 2 == 1)
			{
				sum = sum * x;
				i--;
			}
			else
			{
				x = x*x;
				i = i/2;
			}
		}
		return sum ;
	}
	public static int fac(int n)
	{
		if(n == 1 || n == 0)
		{
			return 1;
		}
		return n*fac(n-1);
	}
	public static double sin(double x)
	{
		double result = 0;
		for(int i = 1; i <= 17; i = i+2)
		{
			if(i % 4 == 1)
			{
				result = result + power(x,i)/fac(i);
			}
			else
			{
				result = result - power(x,i)/fac(i);
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int y = sc.nextInt();
		double z;
		z = power(x,y);
		System.out.println(z);
		System.out.println(fac(y));
		System.out.println(sin(Math.PI/2));

	}

}
