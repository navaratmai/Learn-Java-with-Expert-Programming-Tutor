package date12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class testjframe extends JFrame
{

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					testjframe frame = new testjframe();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testjframe()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setText("cat");
		txt1.setBounds(256, 30, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setText("\u0E41\u0E21\u0E27");
		txt2.setBounds(256, 98, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				File f = new File("D://xxx.txt");
				FileOutputStream outs;
				PrintWriter pw = null;
				try
				{
					outs = new FileOutputStream(f,true);
					pw = new PrintWriter(outs);
					pw.println(txt1.getText()+ "," + txt2.getText());
					pw.close();
				} 
				catch (FileNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnOk.setBounds(152, 178, 89, 23);
		contentPane.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("Word");
		lblNewLabel.setBounds(68, 49, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Meaning");
		lblNewLabel_1.setBounds(68, 101, 46, 14);
		contentPane.add(lblNewLabel_1);
	}
}
