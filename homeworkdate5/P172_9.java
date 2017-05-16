package homeworkdate5;

public class P172_9
{

	public static void main(String[] args)
	{
		int miles,kilo2=20;
		double kilo =0.0,miles2=0.0;
		System.out.println("Miles\tKilometers\tKilometers\tMiles");
		//for(int i =0; i <= 10; i++)
		//{
			for(miles = 1; miles <= 10; miles++)
			{
				kilo = miles*1.609;
				miles2 = kilo2/1.609;
				System.out.print(miles + "\t" + kilo + "\t\t" + kilo2 + "\t\t"  + miles2);
				System.out.println();
				kilo2 += 5;
			}
			
		//}

	}

}
