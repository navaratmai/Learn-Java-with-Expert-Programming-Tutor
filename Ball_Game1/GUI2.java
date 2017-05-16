import java.awt.*;

import javax.swing.JFrame;
public class GUI2 extends JFrame
{
	Ball[] balls;
	public GUI2()
	{
		balls = new Ball[10];
		for(int i = 0; i < balls.length; i++)
		{
			balls[i] = new Ball();
			balls[i].R = (int)(Math.random()*255);
			balls[i].G = (int)(Math.random()*255);
			balls[i].B = (int)(Math.random()*255);
			balls[i].Size = (int)(Math.random()*255);
			
			balls[i].pos = new Vector();
			balls[i].pos.x = (int)(Math.random()*500);
			balls[i].pos.y = (int)(Math.random()*500);
			
			balls[i].vel = new Vector();
			balls[i].vel.x = (int)(Math.random()*10-5);
			balls[i].vel.y = (int)(Math.random()*10-5);
		}
		JFrame f = new JFrame();
		//f.add(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		for(int i = 0; i < balls.length; i++)
		{
			balls[i].draw(g);
		}
	}
	public static void main(String[] args)
	{
		new GUI2();

	}

}
