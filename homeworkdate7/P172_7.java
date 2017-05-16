package homeworkdate7;

import java.util.Arrays;
import java.util.Scanner;

public class P172_7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Please input number : ");
		n = sc.nextInt();
		int []a = new int[n];
		for(int i = 0;i < n; i++)
		{
			System.out.print("Please input num : ");
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		for(int i = a.length-1; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		
		

	}

}
