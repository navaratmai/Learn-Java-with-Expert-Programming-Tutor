package homework;

import java.util.Scanner;

public class P177_13
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,score;
		double total=0,total1=0,total2=0,total3=0,total4=0,total5=0;
		double avg,avg1,avg2,avg3,avg4,avg5;
		System.out.print("Please input number : ");
		n = sc.nextInt();
		for(int i = 1; i <= n;i++)
		{
			System.out.println("student " + i );
			for(int j = 1; j <= 5; j++)
			{
				System.out.print("Please input score " + j +" : ");
				score = sc.nextInt();
				total = total + score;
				if(j == 1)
				{
					total1 = total1 + score;
				}
				else if(j == 2)
				{
					total2 = total2 + score;
				}
				else if(j == 3)
				{
					total3 = total3 + score;
				}
				else if(j == 4)
				{
					total4 = total4 + score;
				}
				else
				{
					total5 = total5 + score;
				}
			}
			
			avg = total/5;
			System.out.println("total : " + total);
			total = 0;
			System.out.println("avg : " + avg);
		}
		System.out.println("avg Algorithm");
		avg1 = total1/n;
		System.out.println("total1 : " + total1);
		System.out.println("avg1 : " + avg1);
		
		avg1 = total2/n;
		System.out.println("total2 : " + total2);
		System.out.println("avg2 : " + avg1);
		
		avg1 = total3/n;
		System.out.println("total3 : " + total3);
		System.out.println("avg3 : " + avg1);
		
		avg1 = total4/n;
		System.out.println("total4 : " + total4);
		System.out.println("avg4 : " + avg1);
		
		avg1 = total5/n;
		System.out.println("total5 : " + total5);
		System.out.println("avg5 : " + avg1);
				
	}

}
