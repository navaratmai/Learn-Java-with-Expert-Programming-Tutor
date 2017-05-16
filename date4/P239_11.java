package date4;

import java.util.Scanner;

public class P239_11
{

	public static void main(String[] args)
	{
		int sum = 0,n = 0,count = 0;
		Scanner sc = new Scanner(System.in);;
		double avg;
		for(;;)
		{
			System.out.print("input positive");
			n = sc.nextInt();
			if(n<0)
			{
				System.out.println("ERROR");
				continue;
			}
			else if(n==0)
			{
				break;
			}
			else
			{
				sum = sum+n;
				count++;
			}
		}
		if(count == 0)
		{
			System.out.println("NO AVG");
		}
		else
		{
			avg = (double)sum/count;
			System.out.println(avg);
		}

	}

}
