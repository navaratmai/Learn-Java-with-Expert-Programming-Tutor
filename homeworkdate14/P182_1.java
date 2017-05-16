package homeworkdate14;

public class P182_1
{

	public static void main(String[] args)
	{
		int x[] = new int[100];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int total = 0;
		double avg = 0;
		
		for(int i = 0; i < x.length; i++)
		{
			x[i] = (int)(Math.random()*100);
			System.out.println("number "+ i + " : " + x[i]);
			if(max < x[i])
			{
				max = x[i];
			}
			if(min > x[i])
			{
				min = x[i];
			}
			total = total + x[i];
		}
		avg = total/100;
		System.out.println();
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("avg : " + avg);
	}

}
