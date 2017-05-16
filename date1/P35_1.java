package date1;

import java.util.Scanner;

public class P35_1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k ;
		System.out.println("Please input your Score");
		k = sc.nextInt();
		if(k < 50)
		{
			System.out.println("F");
		}else 
		{
			if(k < 60)
			{
				System.out.println("D");
			}else 
			{
				if(k < 70)
				{
				System.out.println("C");
				}else 
				{
					if(k < 80)
					
						System.out.println("B");
					else
					
						System.out.println("A");
					

				}
			}
		}
	}

}

