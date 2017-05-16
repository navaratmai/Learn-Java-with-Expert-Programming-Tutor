package date4;

public class P237_6
{

	public static void main(String[] args)
	{
		for(int i=1; i<=110; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print("cozaloza\t");
			}
			else if(i%3==0)
			{
				System.out.print("coza\t");
			}
			else if(i%5==0)
			{
				System.out.print("loza\t");
			}
			else if(i%7==0)
			{
				System.out.print("woza\t");
			}
			else
			{
				System.out.print(i + "\t");
			}
			if(i%11==0)
			{
				System.out.println();
			}
		}

	}

}
