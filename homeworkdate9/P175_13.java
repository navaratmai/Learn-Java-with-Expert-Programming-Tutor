package homeworkdate9;

import java.util.*;

public class P175_13
{

	public static void main(String[] args)
	{
		int []a = new int[100];
	
		for(int i = 0;i < 100; i++)
		{
			a[i] = (int)(Math.random()*99);
		}
		
		for(int j = 0; j <= 99; j++)
		{
			System.out.print(a[j] + "\t");
			 if ((j == 24) || (j == 49) || (j == 74)) 
			 {
				    System.out.println("");
			 }
		}
	}

}
