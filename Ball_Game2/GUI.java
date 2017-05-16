import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
//class GUI คือการเอาลูกบอลไปใช้
public class GUI extends JPanel
{
	Ball[] balls;
	public GUI()
	{
		balls = new Ball[10];//สร้างอาร์เรย์ของบอลมา 10 ลูก
		for(int i = 0; i < balls.length; i++)
		{
			balls[i] = new Ball();
		}
		
		Thread t = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				while(true)
				{
					try
					{
						Thread.sleep(20);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					for(int i = 0; i < balls.length; i++)
					{
						balls[i].move();
					}
					repaint();
				}
			}
		});
		t.start();
		
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);//ขนาดจอ
		f.setVisible(true);//ให้แสดงขึ้นมา
	}
	public void paint(Graphics g)//ให้แสดงบอลออกมา
	{
		super.paint(g);//เรียกแม่คือ super คือฉากหลังสีเทาๆ 
		for(int i = 0; i < balls.length; i++)
		{
			balls[i].draw(g);
		}
	}
	
	public static void main(String[] args)
	{
		new GUI();
	}
}
