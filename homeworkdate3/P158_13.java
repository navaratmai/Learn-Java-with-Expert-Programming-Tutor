package homeworkdate3;

import java.util.Scanner;

public class P158_13
{

	public static void main(String[] args)
	{
		double n1,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input ");
		n = sc.nextDouble();
		
		n1 = Math.sqrt(2*Math.PI*n)*Math.pow(n/Math.E,n);
		
		System.out.println(n1);
		

	}

}
