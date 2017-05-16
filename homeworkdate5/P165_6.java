package homeworkdate5;

import java.util.Scanner;

public class P165_6
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int hour,minute,total;
		System.out.print("Plase input hour : ");
		hour = sc.nextInt();
		System.out.print("Plase input minute : ");
		minute = sc.nextInt();
		if(hour == 0 && minute < 60)
		{
			total = 0;
		}
		else
			
		{
			total = hour * 30;
		}
		System.out.println(hour + " ชั่วโมง " + minute + " นาที ค่าจอดรถเป็น " + total + " บาท " );


	}

}
