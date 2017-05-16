import java.awt.Color;
import java.awt.Graphics;

public class Ball
{
	public int R,G,B,Size;
	public Vector pos,vel;
	public void draw(Graphics g)
	{
		g.setColor(new Color(R,G,B));
		g.fillOval((int) (pos.x),(int) (pos.y), Size, Size);
	}
}
