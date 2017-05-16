package date14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sort_country_by_population
{

	public static void main(String[] args)
	{
		Scanner sc = null;
		try
		{
			ArrayList<City> citys = new ArrayList<City>();//ขยายขนาดเองได้ อาร์เรย์ลิส
			int i = 0;
			sc = new Scanner(new File("C:/Users/ArmYo/Downloads/world.csv"));
			while (sc.hasNext())
			{
				String s = sc.nextLine();
				String[] ss = s.split(";");
				City c = new City();
				System.out.println(i);
				c.id = Integer.parseInt(ss[0].substring(1, ss[0].length()-1));
				c.name = (ss[1].substring(1, ss[1].length()-1));
				c.country = (ss[2].substring(1, ss[2].length()-1));
				if (ss[3].equals(""))
				{
				}
				else
				{
					c.district = (ss[3].substring(1, ss[3].length()-1));
				}
				c.population = Long.parseLong(ss[4].substring(1, ss[4].length()-1));
				
				citys.add(c);
				i++;
				if(i > 4000)
				{
					break;
				}
			}
			for(int j = 0; j < citys.size(); j++)
			{
				System.out.println(citys.get(j));
			}
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}finally
		{
			if(sc != null)
			{
				sc.close();
			}
		}

	}

}
