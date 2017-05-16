package date2;

public class P233_6_3
{

	public static void main(String[] args)
	{
		int n = 5;
		for (int j = 1; j <= n; j++)
		{
			for(int i = 1; i <= n; i++)
			{
				if(i == j || i == n - j + 1)
				{
					System.out.print("X");
				}else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}

	}

}
