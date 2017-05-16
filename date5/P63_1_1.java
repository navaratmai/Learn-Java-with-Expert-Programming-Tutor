package date5;

import java.util.Scanner;

public class P63_1_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int [][] a = new int[3][3];
		int [][] b = new int[3][3];
		int [][] c = new int[3][3];
		// array a
		for(int i = 0 ; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				System.out.print("Please input A :");
				a[i][j] = sc.nextInt();
			}
		}
		// array b
		for(int i = 0 ; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print("Please input B :");
				b[i][j] = sc.nextInt();
			}
		}
		//array c
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{ 
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		// print a
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		// print b
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		// print c
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
