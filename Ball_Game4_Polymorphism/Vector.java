/**
 * คำอธิบายของ class Vector สามารถใส่ตรงนี้
 * @author ArmYo
 *
 */
public class Vector
{
	/**
	 * ค่าของ Vector นั้นละ
	 */
	double x,y;
	
	//construtor คือ method ที่ชื่อเหมืนอ class จะถูกเรียครั้งแรก ครั้งเดียวตอน new obj.
	//จาก  class construtor จะไม่มี return type 
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
		Vector result = new Vector();//new = สร้าง
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
		Vector result = new Vector();//new = สร้าง
		result.x = x - v.x;
		result.y = y - v.y;
		return result;
	}
	public Vector mul(double m)
	{
		Vector result = new Vector();//new = สร้าง
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
