package date4;

public class P50_6
{

	public static void main(String[] args)
	{
		int n,i,count;
		int prime_count=0;
		n = 2;
		while (prime_count < 100)
		{
			count = 0;
			i = 2;
			while (i < n)
			{
				if(n % i == 0)
				{
					count++;
					break;
				}
				i++;
			}
			if (count == 0)
			{
				System.out.println(n + "\t");
				prime_count++;
			}
			n++;
		}

	}

}
