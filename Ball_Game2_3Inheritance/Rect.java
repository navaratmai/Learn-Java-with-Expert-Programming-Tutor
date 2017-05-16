import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Ball//คลาส rect เป็นคลาสลูกของ ball
{
	//ไม่มีการ รีเทรนด์จึงเป็น void จบในตัวมันเอง
	public void draw(Graphics g)
	{
		g.setColor(new Color(R,G,B,200));
		g.fillRect((int)(pos.x), (int)(pos.y), Size, Size);//วาดสี่เหลี่ยม
	}
}
 