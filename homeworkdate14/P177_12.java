package homeworkdate14;

import java.util.Arrays;
import java.util.Scanner;

public class P177_12
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		int lowerindex,upperindex;
		int total = 0;
		
		System.out.print("Please input number : ");
		n = sc.nextInt();
		
		int []a = new int[n];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = (int)(Math.random()*1000);
		}
		System.out.println("Please input lowerindex : ");
		lowerindex = sc.nextInt();
		System.out.println("Please input Upperindex : ");
		upperindex = sc.nextInt();
		
		if(lowerindex < upperindex)
		{
			for(int i = lowerindex; i <= upperindex; i++)
			{
				total = total + a[i];
			}
			System.out.println(Arrays.toString(a));
			System.out.println("total : " + total);
		}
		else
		{
			System.out.println("ERROR");
		}
	}

}
