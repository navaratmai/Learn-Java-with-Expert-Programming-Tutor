package homeworkdate3;

import java.util.Scanner;

public class P157_7
{

	public static void main(String[] args)
	{
		double number1,number2,number3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input 3 number : ");
		number1 = sc.nextDouble();
		number2 = sc.nextDouble();
		number3 = sc.nextDouble();
		
		double total;
		
		total = number1+number2+number3;
		System.out.println("total =  " + total);
		double average;
		
		average = total / 3.0;
		
		System.out.println("average = " + average);
		

	}

}
