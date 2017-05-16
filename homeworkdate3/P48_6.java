package homeworkdate3;

public class P48_6
{

	public static void main(String[] args)
	{
		int n = 10;
		for(int j = 0;j<n;j++)
		{
			for(int i=0;i<(n-j-1); i++)
			{
				System.out.print("-");
				
				
			}
			for(int k = 0; k <((2*j)+1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
