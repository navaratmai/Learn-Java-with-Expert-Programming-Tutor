import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Ball
{
	public void draw(Graphics g)//การแก้คุณสมบัติ เรียกว่า Override
	{
		g.setColor(new Color(R, G, B));
		g.fillRect((int)(pos.x), (int)(pos.y), Size, Size);
	}
}
