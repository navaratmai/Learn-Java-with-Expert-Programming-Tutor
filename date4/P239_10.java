package date4;

public class P239_10
{

	public static void main(String[] args)
	{
		double sum = 0;
		int n =50000;
		for(int i=1;i<=n;i++)
		{
			int k = 2*i-1;
			sum = sum+1.0/k;
			i++;
			k = 2*i-1;
			sum = sum-1.0/k;
		}
		System.out.println(sum*4);

	}

}
