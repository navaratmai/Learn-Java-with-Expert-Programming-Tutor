package date2;

public class P231_2
{

	public static void main(String[] args)
	{
		double g,G,m2,R;
		
		G = 6.67e-11;
		m2 = 5.974e24;
		R = 6371e3;
		
		g = G*m2/(R*R);
		
		System.out.println(g);

	}

}
