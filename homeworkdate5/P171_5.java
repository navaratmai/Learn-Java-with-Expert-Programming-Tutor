package homeworkdate5;

import java.util.Scanner;

public class P171_5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int totalsales,commission;
		int count = 1;
		System.out.println("\t\tNo.\t\tTotal Sales Baht\tSales");
		System.out.println("Commission Baht");
		while(true)
		{
			System.out.print("Please Input Total Sales Of  #" + count + " :\t");
			totalsales = sc.nextInt();
			System.out.print("\t\t" + count + "\t\t\t");
			count++;
			if(totalsales < 0)
			{
				System.out.print(totalsales + "\t\t");
				System.out.println("exit");
				break;
			}
			if(totalsales >= 25000)
			{
				commission = (totalsales*10)/100;
			}
			else if(totalsales >= 10000)
			{
				commission = (totalsales*7)/100;
			}
			else
			{
				commission = 0;
			}
		System.out.print(totalsales + "\t\t" + commission);
		System.out.println();
		}

	}

}
