package homeworkdate3;

import java.util.Scanner;

public class P157_5
{

	public static void main(String[] args)
	{
		double Celsius , Fahrenheit ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number (Celsius)");
		Celsius = sc.nextDouble();
		
		Fahrenheit = Celsius * 1.80 + 32 ;
		
		System.out.println("Fahrenheit = " + Fahrenheit);

	}

}
