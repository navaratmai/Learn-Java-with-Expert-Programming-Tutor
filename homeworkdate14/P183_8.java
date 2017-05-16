package homeworkdate14;

import java.util.Scanner;

public class P183_8
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [][]a = new int[3][3];
		int [][]b = new int[3][3];
		int [][]c = new int[3][3];
		int [][]d = new int[3][3];
		
		//ใส่ตัวเลขใน Array A
		for (int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				System.out.print("Please input A :");
				a[i][j] = sc.nextInt();
			}
		}
		
		//ใส่ตัวเลขใน Array B
		for (int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print("Please input B :");
				b[i][j] = sc.nextInt();
			}
		}
		
		//ใส่ผลบวก ของอาร์เรย์ a และ b
		for(int i = 0; i < c.length; i++)
		{
			for(int j = 0; j < c[0].length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		//ใส่ผลคูณ ของอาร์เรย์ a และ b
		for(int i = 0; i < d.length; i++)
		{
			for(int j = 0; j < d[0].length; j++)
			{
				d[i][j] = a[i][j] * b[i][j];
			}
		}
		
		// print Array a
		System.out.println("Array a");
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		// print Array b
		System.out.println("Array b");
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		// print Array c
		System.out.println("Array c");
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
		// print Array d
		System.out.println("Array d");
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
