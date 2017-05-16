package date4;

public class P238_7
{

	public static void main(String[] args)
	{
		System.out.print("* | ");
		for(int a = 1; a <= 9; a++)
		{
			System.out.print(a + "\t");
		}
		System.out.println();
		System.out.print("------------------------------------------------------------------");
		System.out.println();
		for(int i = 1; i <= 9; i++)
		{
			System.out.print(i + " | " );
			for(int j = 1; j <= 9; j++)
			{
				int k = i * j;
				System.out.print(k + "\t");
			}
			System.out.println();
		}
	}
}
