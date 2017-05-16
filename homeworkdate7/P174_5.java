package homeworkdate7;

import java.util.Scanner;

public class P174_5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,a;
		int sum = 0;
		double avg = 0.0;
		System.out.print("Please input number : ");
		n = sc.nextInt();
		for(int i = 1 ; i <= n; i++)
		{
			System.out.print("Please input : ");
			a = sc.nextInt();
			if(a == 0)
			{
				break;
			}
			sum = sum + a;
		}
		avg = sum/n;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}
