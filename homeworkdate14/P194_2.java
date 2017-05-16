package homeworkdate14;

import java.util.Scanner;

public class P194_2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		double c,d;
		
		System.out.println("Please input number : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextDouble();
		d = sc.nextDouble();
		int []x = new int[b];
		int []y = new int[b];
		int []z = new int[(int)d];
		for(int i = 0; i < x.length; i++)
		{
			x[i] = random(b);
			System.out.print(x[i]+"\t");
		}
		System.out.println();
		for(int i = 0; i < y.length; i++)
		{
			y[i] = random(a,b); 
			System.out.print(y[i]+"\t");
		}
		System.out.println();
		System.out.println(random(c,d));
		
	}
	
	public static int random(int b)
	{
		return (int)(Math.random()*b);
	}
	public static int random(int a , int b)
	{
		return (int)((Math.random()*b-1)+a);
	}
	public static double random(double a, double b)
	{
		return ((Math.random()*b-1)+a);
	}

}
