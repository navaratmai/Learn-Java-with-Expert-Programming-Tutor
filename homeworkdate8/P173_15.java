package homeworkdate8;

import java.util.Scanner;

public class P173_15
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b ,c ,d,p,q;
		System.out.println("input Fractal a,b,c,d");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		p = (a*d)+(b*c);
		q = b*d;
		
		System.out.println(p + " / " + q);
		
		if(p > q)
		{
			
		}
		else
		{
			int t = p;
			p = q;
			q = t;
		}
		
		while (q > 0)
		{
			p =p%q;
			int t = p;
			p = q;
			q = t;
			
		}
		while (p > 0)
		{
			q =q%p;
			int t = q;
			q = p;
			p = t;
		}
		System.out.println(p + " / " + q);
		

	}

}
