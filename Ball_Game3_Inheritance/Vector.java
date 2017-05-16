/**
 * à¸„à¸³à¸­à¸˜à¸´à¸šà¸²à¸¢à¸‚à¸­à¸‡ class Vector à¸ªà¸²à¸¡à¸²à¸£à¸–à¹ƒà¸ªà¹ˆà¸•à¸£à¸‡à¸™à¸µà¹‰
 * @author ArmYo
 *
 */
public class Vector
{
	/**
	 * à¸„à¹ˆà¸²à¸‚à¸­à¸‡ Vector à¸™à¸±à¹‰à¸™à¸¥à¸°
	 */
	double x,y;
	
	//construtor à¸„à¸·à¸­ method à¸—à¸µà¹ˆà¸Šà¸·à¹ˆà¸­à¹€à¸«à¸¡à¸·à¸™à¸­ class à¸ˆà¸°à¸–à¸¹à¸�à¹€à¸£à¸µà¸¢à¸„à¸£à¸±à¹‰à¸‡à¹�à¸£à¸� à¸„à¸£à¸±à¹‰à¸‡à¹€à¸”à¸µà¸¢à¸§à¸•à¸­à¸™ new obj.
	//à¸ˆà¸²à¸�  class construtor à¸ˆà¸°à¹„à¸¡à¹ˆà¸¡à¸µ return type 
	public Vector()
	{
		x = 0;
		y = 0;
	}
	public Vector(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public Vector add(Vector v)
	{
		Vector result = new Vector();//new = à¸ªà¸£à¹‰à¸²à¸‡
		result.x = x + v.x;
		result.y = y + v.y;
		return result;
	}
	
	public String toString()
	{
		return "("+x+","+y+")";
	}
	
	public Vector sub(Vector v)
	{
		Vector result = new Vector();//new = à¸ªà¸£à¹‰à¸²à¸‡
		result.x = x - v.x;
		result.y = y - v.y;
		return result;
	}
	public Vector mul(double m)
	{
		Vector result = new Vector();//new = à¸ªà¸£à¹‰à¸²à¸‡
		result.x = x * m;
		result.y = y * m;
		return result;
	}
	public double dot(Vector v)
	{
		double result = this.x * v.x + this.y * v.y;
		return result;
	}
	public double size()
	{
		double result = Math.sqrt(x * x + y * y);
		return result;
	}
	public Vector unit()
	{
		double s = size();
		return new Vector(x/s,y/s);
	}
}
