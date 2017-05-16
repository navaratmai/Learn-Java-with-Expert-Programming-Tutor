package homeworkdate7;

public class P171_4
{

	public static void main(String[] args)
	{
		int sumf = 0;
		int sumw = 0;
		int sumd = 0;
		System.out.println("Loop for");
		for(int i = 2; i <= 100; i++)
		{
			if(i%2 == 0)
			{
				sumf = sumf + i;
				System.out.println(i);	
			}
		}
		System.out.println("Loop While");
		int i=2;
		while(i <= 100)
		{
			if(i%2 == 0)
			{
				sumw = sumw + i;
				System.out.println(i);	
			}
			i++;
		}
		System.out.println("Loop do-while");
		int x = 2;
		do
		{
			if(x%2 == 0)
			{
				sumd = sumd + x;
				System.out.println(x);	
			}
			x++;
		}while(x <= 100);
		System.out.println("sumfor = " + sumf);
		System.out.println("sumWhile = " + sumw);
		System.out.println("sum do-while = " + sumd);
		

	}

	
}
