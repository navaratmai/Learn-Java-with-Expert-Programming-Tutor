package homework;

import java.util.Scanner;

public class P178_3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int hour,minute,hour1,minute1;
		int totalhour=0,totalminute=0;
		
		System.out.println("Please input start hour 1-12 and minute :");
		hour = sc.nextInt();
		minute = sc.nextInt();
		System.out.println("Please input end hour 1-12 and minute :");
		hour1 = sc.nextInt();
		minute1 = sc.nextInt();
		
		totalhour = hour1 - hour ;
		totalminute = minute1 - minute;
		
		System.out.println("time : " + totalhour + " . " + totalminute);
		

	}

}
