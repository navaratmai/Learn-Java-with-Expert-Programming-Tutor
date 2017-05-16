package date13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Dictionary1 extends JFrame
{

	private JPanel contentPane;
	private JTextField txt;
	private JButton btnNewButton;
	private JTextArea textArea;

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
					Dictionary1 frame = new Dictionary1();
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
	public Dictionary1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWord = new JLabel("Word");
		lblWord.setBounds(39, 60, 46, 14);
		contentPane.add(lblWord);
		
		JLabel lblMeaning = new JLabel("Meaning");
		lblMeaning.setBounds(39, 113, 46, 14);
		contentPane.add(lblMeaning);
		
		txt = new JTextField();
		txt.setBounds(123, 57, 189, 20);
		contentPane.add(txt);
		txt.setColumns(10);
		
		btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String mytext_tosearch = txt.getText().trim().toUpperCase();
				File f = new File("dictionary2.txt");
				Scanner sc = null;
				try
				{
					boolean isFound = false;
					System.out.println("start read File");
					sc = new Scanner(f, "UTF-8");
					while(sc.hasNext())
					{
						String word = sc.nextLine();
						String meaning = sc.nextLine();
						if(word.equals(mytext_tosearch))
						{
							textArea.setText(meaning);
							isFound = true;
							break;
						}
					}
					if(!isFound)
					{
						JOptionPane.showMessageDialog(Dictionary1.this, "word NOT FOUND ! ");
					}
					System.out.println("end read File");
				} catch (FileNotFoundException e)
				{
					System.out.println("this is error");
					e.printStackTrace();
				}
				finally
				{
					System.out.println("this is finally");
					if(sc!= null)
					{
						sc.close();
					}
				}
			}
		});
		btnNewButton.setBounds(335, 56, 89, 23);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBackground(Color.YELLOW);
		textArea.setBounds(123, 108, 301, 142);
		contentPane.add(textArea);
		
		JLabel lblThisIsMy = new JLabel("This is my dictionary");
		lblThisIsMy.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThisIsMy.setBounds(88, 11, 194, 35);
		contentPane.add(lblThisIsMy);
	}
}
