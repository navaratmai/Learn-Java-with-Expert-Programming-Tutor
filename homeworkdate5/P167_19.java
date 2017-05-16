package homeworkdate5;

import java.util.Scanner;

public class P167_19
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		System.out.print("Plase input a : ");
		a = sc.nextDouble();
		System.out.print("Plase input b : ");
		b = sc.nextDouble();
		System.out.print("Plase input c : ");
		c = sc.nextDouble();
		System.out.print("Plase input d : ");
		d = sc.nextDouble();
		System.out.print("Plase input e : ");
		e = sc.nextDouble();
		System.out.print("Plase input f : ");
		f = sc.nextDouble();
		
		x = ((e*d)-(b*f))/((a*d)-(b*c));
		y = ((a*f)-(e*c))/((a*d)-(b*c));
		
		System.out.println(x);
		System.out.println(y);

	}

}
