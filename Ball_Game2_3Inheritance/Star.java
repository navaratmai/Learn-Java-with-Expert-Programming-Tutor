import java.awt.Color;
import java.awt.Graphics;

public class Star extends Ball
{
	//public int R,G,B,Size;
	//public Vector pos,vel;
	/*
	public void move()
	{
		pos = pos.add(vel);
		if(pos.x + Size > 500)
		{
			pos.x = 500 - Size;
			vel.x *= -1;
		}
		if(pos.x < 0)
		{
			pos.x = 0;
			vel.x *= -1;
		}
		if(pos.y + Size > 500)
		{
			pos.y = 500 - Size;
			vel.y *= -1;
		}
		if(pos.y < 0)
		{
			pos.y = 0;
			vel.y *= -1;
		}
	}
	*/
	//ไม่มีการ รีเทรนด์จึงเป็น void จบในตัวมันเอง
	public void draw(Graphics g)
	{
		g.setColor(new Color(R,G,B,200));
		int n = 10;
		int x[] = new int[n*2];
		int y[] = new int[n*2];
		
		for(int i  = 0; i < n * 2; i++)
		{
			x[i] = (int)(pos.x + Size * Math.cos(Math.PI * i / n));
			y[i] = (int)(pos.y + Size * Math.sin(Math.PI * i / n));
			i++;
			x[i] = (int)(pos.x + Size / 2 * Math.cos(Math.PI * i / n));
			y[i] = (int)(pos.y + Size / 2 * Math.sin(Math.PI * i / n));
			//วาดดาว
		}
		g.fillPolygon(x, y, n*2);
	}
}
 