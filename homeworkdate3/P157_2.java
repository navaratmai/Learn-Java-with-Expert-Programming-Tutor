package homeworkdate3;

import java.util.Scanner;

public class P157_2
{

	public static void main(String[] args)
	{
		double r , area ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input รัศมีของวงกลม ");
		
		r = sc.nextDouble();
		
		area = Math.PI*(r*r);
		
		System.out.println("พื้นที่วงกลม = " + area);
		
		

	}

}
