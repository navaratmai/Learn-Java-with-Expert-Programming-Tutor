package homeworkdate8;

public class P174_1
{

	public static void main(String[] args)
	{
		int count = 0;
		double a = 500;
		for(int i = 0; i <= 100; i++)
		{
			count++;
			a = a*0.03;
			if(a >= 20000)
			{
				System.out.println(count);
			}
		}

	}

}
