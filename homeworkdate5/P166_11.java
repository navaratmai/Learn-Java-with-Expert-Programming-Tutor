package homeworkdate5;

import java.util.Scanner;

public class P166_11
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.print("Plase input x : ");
		x = sc.nextInt();
		if(x > 100)
		{
			y = 20;
		}
		else
		{
			y = 0;
		}
		System.out.println("ค่าของ x = " + x + " ค่าของ y = " + y);

	}

}
