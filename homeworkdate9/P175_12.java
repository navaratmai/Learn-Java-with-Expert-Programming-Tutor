package homeworkdate9;

import java.util.Scanner;

public class P175_12
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int []a = new int[10];
		int maxodd = Integer.MIN_VALUE;
		int minodd = Integer.MAX_VALUE;
		int maxeven = Integer.MIN_VALUE;
		int mineven = Integer.MAX_VALUE;
		System.out.println("Plaeas input 10 number : ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
			if(a[i]%2==0)
			{
				if(maxeven < a[i])
				{
					maxeven = a[i];
				}
				if(mineven > a[i])
				{
					mineven = a[i];
				}
			}
			else
			{
				if(maxodd < a[i])
				{
					maxodd = a[i];
				}
				if(minodd > a[i])
				{
					minodd = a[i];
				}
			}
		}
		System.out.println("maxodd : " + maxodd);
		System.out.println("minodd : " + minodd);
		System.out.println("maxeven : " + maxeven);
		System.out.println("mineven : " + mineven);
	}

}
