package homeworkdate9;


import java.util.Scanner;

public class P176_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Plaeas input number : ");
		n = sc.nextInt();
		int []a = new int[n];
		for(int i = 0;i < a.length; i++)
		{
			a[i] = (int)(Math.random()*a.length);
		}
		
		for(int j = 0; j <= a.length; j++)
		{
			System.out.print(a[j] + "\t");
		}
		

	}

}
