package date2;

import java.util.Scanner;

public class P233_5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("input 3 number");
		
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int max,x,y;
		
		if(a >= b && a >=c )
		{
			max = a ;
			x = b ;
			y = c ;
		}else if(b >= c && b >= a)
			{
				max = b;
				x = a;
				y = c;
			}
			else
			{
				max = c;
				x = a;
				y = b;
			}
		
		if(x + y <= max)
		{
			System.out.println("is not tri");
			return;
		}
		
		int m,n;
		m = max *max;
		n = x*x+y*y;
		
		if(m > n)
		{
			System.out.println("ป้าน");
		}
		else if(m < n)
		{
			System.out.println("แหลม");
		}
		else
		{
			System.out.println("ฉาก");
		}
		
		if(a == b && b == c)
		{
			System.out.println("ด้านเท่า");
		}
		else if(a == b || b == c || b == c)
		{
			System.out.println("หน้าจั่ว");
		}
		else
		{
		System.out.println("ไม่เท่า");
		}
	
	}
}
