package date12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P138read
{

	public static void main(String[] args)
	{
		File f = new File("d://xxx.txt");
		Scanner sc = null;
		try
		{
			sc = new Scanner(f);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(sc.hasNext())
		{
			String s = sc.nextLine();
			System.out.println(s);
		}
		sc.close();
	}

}
