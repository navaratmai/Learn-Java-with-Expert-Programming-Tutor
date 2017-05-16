package homeworkdate8;

import java.util.Scanner;

public class P178_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a,b,c,d;
		double sum = 0;
		double total = 0;
		
		System.out.print("สินค้าชิ้นที่  1 : ");
		a = sc.nextDouble();
		System.out.print("สินค้าชิ้นที่  2 : ");
		b = sc.nextDouble();
		System.out.print("สินค้าชิ้นที่  3 : ");
		c = sc.nextDouble();
		System.out.print("สินค้าชิ้นที่  4 : ");
		d = sc.nextDouble();
		
		sum = a + b + c + d;
		if(a < b && a < c && a < d)
		{
			total = b+c+d;
		}
		else if(b < a && b < c && b < d)
		{
			total = a+c+d;
		}
		else if(c < a && c < b && c < d)
		{
			total = a+b+d;
		}
		else if(d < a && d < b && d < c)
		{
			total = a+b+c;
		}
		else
		{
			total = a+b+c;
		}
		System.out.println("ราคาของสินค้าทั้งหมด : " + sum);
		System.out.println("จำนวนเงินที่ต้องชำระ : " + total);
		

	}

}
