package homeworkdate5;

import java.util.Scanner;

public class P166_12
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double weight;
		int money;
		System.out.print("Plase input weight : ");
		weight = sc.nextDouble();
		if(weight > 3.0)
		{
			money = 100;
		}
		else if(weight > 2.0)
		{
			money = 70;
		}
		else if(weight > 1.0)
		{
			money = 60;
		}
		else
		{
			money = 50;
		}
		System.out.println("สินค้ามีน้ำหนัก  " + weight + " กิโลกรัม  คิดค่าจัดส่ง " + money + " บาท ");

	}

}
