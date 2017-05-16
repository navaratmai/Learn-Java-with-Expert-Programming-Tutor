package date4;

public class P50_5
{

	public static void main(String[] args)
	{
		int n,i,count;
		n = 2;
		while(n <= 100)
		{
			count = 0;
			i = 1;
			while(i <= n)
			{
				if(n % i == 0)
				{
					count++;
					
				}
				i++;
			}
			if(count == 2)
			{
				System.out.println(n);
			}
			n++;
		}
	}

}
