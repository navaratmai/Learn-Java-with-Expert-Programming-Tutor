package homeworkdate3;

import java.util.Scanner;

public class P157_6
{

	public static void main(String[] args)
	{
		int number1,number2,number3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input 3 number : ");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		
		int total;
		
		total = number1+number2+number3;
		System.out.println("total =  " +total);
		double average;
		
		average = total / 3.0;
		
		System.out.println(average);
		
		

	}

}
