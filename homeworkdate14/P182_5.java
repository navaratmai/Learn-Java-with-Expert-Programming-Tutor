package homeworkdate14;

import java.util.Arrays;
import java.util.Scanner;

public class P182_5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []a = new int[10];
		
		System.out.println("Please input number : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int j = 0; j < a.length; j++)
		{
			for(int i = 0; i < a.length-1; i++)
			{
				if(a[i] > a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
