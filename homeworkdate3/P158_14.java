package homeworkdate3;

import java.util.Scanner;

public class P158_14
{

	public static void main(String[] args)
	{
		int a, b, c, d, f, total ;
		double num, avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("จำนวนนักเรียนที่ได้เกรด A : ");
		a = sc.nextInt();
		System.out.print("จำนวนนักเรียนที่ได้เกรด B : ");
		b = sc.nextInt();
		System.out.print("จำนวนนักเรียนที่ได้เกรด C : ");
		c = sc.nextInt();
		System.out.print("จำนวนนักเรียนที่ได้เกรด D : ");
		d = sc.nextInt();
		System.out.print("จำนวนนักเรียนที่ได้เกรด F : ");
		f = sc.nextInt();
		
		total = a+b+c+d+f;
		num = (4*a)+(3*b)+(2*c)+(1*d)+(0*f);
		avg = num/total;
		
		System.out.println(total);
		System.out.println(num);
		System.out.println(avg);
		

	}

}
