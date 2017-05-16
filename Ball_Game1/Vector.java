

public class Vector
{
	public double x,y;
	public Vector add(Vector v)
	{
		Vector result = new Vector();
		result.x = x + v.x;
		result.y = y + v.y;
		return result;
	}
}
