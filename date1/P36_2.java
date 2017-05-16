package date1;

import java.util.Scanner;

public class P36_2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double weigth,height,BMI;
		
		System.out.println("Please input yout weight(kg)");
		weigth = sc.nextDouble();
		System.out.println("Please input yout Height(cin)");
		height = sc.nextDouble();
		height = height/100;
		BMI = weigth/(height*height);
		
		System.out.println(BMI);
		
		if(BMI > 25)
		{
			System.out.println("Your Fat");
		}
		else
		{
			if(BMI<20)
			{
				System.out.println("Your Thin");
			}
			else
			{
				System.out.println("Your Normal");
			}
		}
	}

}
