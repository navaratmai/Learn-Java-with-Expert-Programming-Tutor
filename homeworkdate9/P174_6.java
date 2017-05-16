package homeworkdate9;

public class P174_6
{

	public static void main(String[] args)
	{
		int []a = new int[100];
		
		for(int i = 0;i < 100; i++)
		{
			a[i] = (int)(Math.random()*100);
		}
		
		for(int j = 0; j < a.length; j++)
		{
			if(a[j]%2==1)
			{
				System.out.print(a[j] + "\t");
			}
			if ((j == 19) || (j == 39) || (j == 59) || (j == 79)) 
			{
				    System.out.println("");
			}
		}

	}

}
