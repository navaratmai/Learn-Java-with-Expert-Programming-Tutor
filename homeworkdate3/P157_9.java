package homeworkdate3;

import java.util.Scanner;

public class P157_9
{

	public static void main(String[] args)
	{
		double length,width,area,around;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input Length : ");
		length = sc.nextDouble();
		System.out.print("Please input Width : ");
		width = sc.nextDouble();
		
		area = length * width;
		around = (length + width) * 2;
		
		System.out.println("Area = " + area);
		System.out.println("Length around = " + around);
		

	}

}
