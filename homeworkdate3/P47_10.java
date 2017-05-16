package homeworkdate3;

public class P47_10
{

	public static void main (String[] args)
	{
		int x ;
		x = 0;
		while(x <= 1000)
		{
			if(x % 3 == 0 && x % 5 == 0 && x % 7 == 0)
			{
				System.out.print("");
			}
			else if(x % 3 == 0 && x % 5 == 0)//||(x % 5 == 0 && x % 7 == 0)||(x % 7 == 0 && x % 3 == 0))
			{
				System.out.println(x);
			}
			else if((x % 5 == 0 && x % 7 == 0))
			{
				System.out.println(x);
			}
			else if(x % 7 == 0 && x % 3 == 0)
			{
				System.out.println(x);
			}
			x++;
		}
	}

}
