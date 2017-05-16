
public class Vectortest
{

	public static void main(String[] args)
	{
		Vector a = new Vector();
		a.x = 3;
		a.y = 4;
		Vector b = new Vector(5,7);
		Vector c;
		c = a.add(b);
		System.out.println(c.x + " " + c.y);
		System.out.println(c);
		
		Vector d;
		d = a.sub(b);
		System.out.println(d.x + " "+ d.y);
		
		System.out.println(a.mul(5));
		
		System.out.println(a.dot(b));
		System.out.println(a.size());
		System.out.println(a.unit());
		a.unit();

	}

}
