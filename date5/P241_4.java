package date5;

import java.util.Arrays;
import java.util.Scanner;

public class P241_4
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
		int index = -1;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] == v )
			{
				index = i;
				break;
			}
		}
		if(index == -1)
			return;
		for(int i = index; i < x.length-1; i++)
		{
			x[i] = x[i+1];
		}
		x[x.length-1] = 0;
		System.out.println(Arrays.toString(x));


	}

}
