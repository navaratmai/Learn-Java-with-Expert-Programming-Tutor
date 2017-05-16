package date4;

public class P238_9
{

	public static void main(String[] args)
	{
		double sum = 0;
		int n = 50000;
		for(int i=1; i<=n; i++)
		{
			sum = sum + 1.0/i;
		}
		System.out.println(sum);

	}

}
