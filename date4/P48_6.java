package date4;

public class P48_6
{

	public static void main(String[] args)
	{
		int j = 1;
		while (j <= 10)
		{
			int i = 1;
			while (i <= 10 -j)
			{
				System.out.print("-");
				i++;
			}
			i = 1;
			while (i <= j)
			{
				System.out.print("x");
				i++;
			}
			i = 2;
			while (i <= j)
			{
				System.out.print("x");
				i++;
			}
			System.out.println();
			j++;
		}

	}

}
