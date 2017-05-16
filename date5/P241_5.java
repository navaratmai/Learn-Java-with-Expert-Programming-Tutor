package date5;

import java.util.Arrays;
import java.util.Scanner;

public class P241_5
{

	public static void main(String[] args)
	{
		int []x = new int [10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < x.length; i++)
		{
			System.out.print("input : ");
			x[i] = sc.nextInt();
		}
		System.out.print("input v : ");
		int v = sc.nextInt();
		System.out.print("input index : ");
		int index = sc.nextInt();
		for(int i = x.length-1;i>index;i--)
		{
			x[i] = x[i-1];
		}
		x[index] = v;
		System.out.println(Arrays.toString(x));

	}

}
