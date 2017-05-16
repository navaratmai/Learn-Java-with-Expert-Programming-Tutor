package date4;

import java.util.Scanner;

public class P49_3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,k;
		a = sc.nextInt();
		b = sc.nextInt();
		k = a;
		while(true)
		{
			if (k % a == 0 && k % b == 0)
			{
				break;
			}
			k++;
		}
		System.out.println(k);

	}

}
