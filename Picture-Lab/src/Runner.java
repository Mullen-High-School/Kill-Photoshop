import java.awt.*;
import javax.swing.*;


public class Runner extends Picture
	{
		private static JMenuBar menuBar = new JMenuBar();
		private static JMenu menu = new JMenu("Test");
		private static JTextField textField;
		
		
		public static void main(String[] args)
			{
				JFrame frame = new JFrame("Shop Photo");
				frame.setSize(800,600);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				menuBar.add(menu);
				frame.setJMenuBar(menuBar);
				Color color = new Color(76,144,255);
				frame.getContentPane().setBackground(color);
				textField = new JTextField("Testing testing 123",10);
				frame.getContentPane().add(textField);
				frame.setVisible(true);
				
				System.out.println("Welcome to use the photoshop trial version");
				System.out.println("We have three different areas for you to tryu to use");
				System.out.println("1. Color Chooser");
				System.out.println("2. Simple Picture Modify");
				
			}

	}
