package homeworkdate3;

import java.util.Scanner;

public class P157_3
{

	public static void main(String[] args)
	{
		double r , area ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input พื้นที่ของวงกลม ");
		
		area = sc.nextDouble();
		
		r = Math.sqrt(area/Math.PI);
		
		System.out.println("รัศมีของวงกลม = " + r);

	}

}
