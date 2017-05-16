package homeworkdate5;

import java.util.Scanner;

public class P163_0
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Plase input a : ");
		a = sc.nextInt();
		System.out.print("Plase input b : ");
		b = sc.nextInt();
		System.out.print("Plase input c : ");
		c = sc.nextInt();
		if(a > 13)
		{
			if(b != 6)
			{
				System.out.println(" A ");
			}
			else if(c <= 7)
			{
				System.out.println(" B ");
			}
			else
			{
				System.out.println(" C ");
			}
		}
		else
		{
			if(b <= 16)
			{
				System.out.println(" D ");
			}
			else if(c > 6)
			{
				System.out.println(" E ");
			}
			else
			{
				System.out.println(" F ");
			}
		}
		

	}

}
