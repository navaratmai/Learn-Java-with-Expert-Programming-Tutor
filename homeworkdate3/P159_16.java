package homeworkdate3;

import java.util.Scanner;

public class P159_16
{

	public static void main(String[] args)
	{
		double second,min,hour,s,day,month;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("second : ");
		second = sc.nextDouble();
		s = second%60;
		//System.out.println(s +" วินาที ");
		
		min = (int)second*0.016667;
		min = (int)min%60-1;
		//System.out.println(min +" นาที");
		
		hour = second*0.00027778;
		hour = (int)hour%24;
		//System.out.println(hour +" ชั่วโมง ");
		
		day = second*0.000011574;
		day = (int)day%30;
		//System.out.println(day +" วัน ");

		month = (int)day/12;
		System.out.println(month + "เดือน     " + day + "วัน     "+ hour +"ชั่วโมง      "+ min +"นาที     "+ s +"วินาที ");
		
	}

}
