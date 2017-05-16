package homeworkdate14;

import java.util.Scanner;

public class P182_6
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []a = new int[3];
		int []b = new int[3];
		int []c = new int[3];
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		System.out.println("Please input product 1 Month1-3");
		for(int i = 0; i < a.length; i++)
		{
			a[i] =  sc.nextInt();
			total1 = total1 + a[i];
		}
		System.out.println("Please input product 2 Month1-3");
		for(int i = 0; i < b.length; i++)
		{
			b[i] =  sc.nextInt();
			total2 = total2 + b[i];
		}
		for(int i = 0; i < c.length; i++)
		{
			c[i] = (a[i]+b[i]);
			total3 = total3 + c[i];
		}
		
		System.out.println("\t\tเดือนที่ 1 \t เดือนที่ 2 \t เดือนที่ 3 \t รวม");
		System.out.println("ใส่ข้อมูลสินค้าชนิดที่ 1\t"+ a[0]+"\t" + a[1]+"\t" + a[2]+ "\t" + total1);
		System.out.println("ใส่ข้อมูลสินค้าชนิดที่ 2\t"+ b[0]+"\t" + b[1]+"\t" + b[2]+ "\t" + total2);
		System.out.println("\tรวม\t" + c[0] + "\t" + c[1] + "\t" + c[2] + "\t" + total3);

	}

}
