package homeworkdate14;

import java.util.Arrays;

public class P183_10
{

	public static void main(String[] args)
	{
		int [][] a = {
						{2,1,3},
						{1,2,1}
					};
		int b[] = {1,2,3};
		int c[][] = {
						{1},
						{2},
						{3}
					};
		
		System.out.println("Array 1");
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("Array 2");
		System.out.println(Arrays.toString(b));
		System.out.println("Array 3");
		for(int i = 0; i < c.length; i++)
		{
			for(int j = 0; j < c[0].length; j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
