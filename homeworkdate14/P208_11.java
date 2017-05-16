package homeworkdate14;

import java.util.Scanner;

public class P208_11
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int b;
		String a;
		int total = 0;
		int count = 0;
		double avg = 0;
		
		
		while(true)
		{
			System.out.print("Please input number Y : N ");
			a = sc.nextLine();
			
			if(a.equals("n"))
			{
				break;
			}
			else if(a.equals("y"))
			{
				System.out.println("Please input number");
				b = sc.nextInt();
				total = total + b;
				count++;
			}
			
			
		}
		avg = (double)total / count;
		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
		
		
		

	}

}
