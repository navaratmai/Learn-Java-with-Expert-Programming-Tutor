package homeworkdate8;

import java.util.Arrays;
import java.util.Scanner;

public class P175_14
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []a = new int[3];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Plaese input number : ");
			a[i] = sc.nextInt();
			if(max < a[i])
			{
				max = a[i];
			}
			if(min > a[i])
			{
				min = a[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		for(int i = a.length-1; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		
		
		
				
	}

}
