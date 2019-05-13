import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Runner extends Picture
	{
		private static JMenuBar menuBar = new JMenuBar();
		private static JMenu menu = new JMenu("IDK");
		
		
		public static void main(String[] args)
			{
				JFrame frame = new JFrame("Shop Photo");
				JPanel panel = new JPanel(new GridLayout(4,4));
				frame.setSize(800,600);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				menuBar.add(menu);
				frame.setJMenuBar(menuBar);
				Color color = new Color(142,0,25);
				frame.getContentPane().setBackground(color);
				JButton button = new JButton("Change Photo");
				button.setVerticalTextPosition(AbstractButton.CENTER);
				button.setHorizontalTextPosition(AbstractButton.TRAILING);
				panel.add(button);
				frame.setContentPane(panel);
				frame.getRootPane().setDefaultButton(button);
				frame.setVisible(true);
				
				
				System.out.println("Welcome to use the photoshop trial version");
				System.out.println("We have three different areas for you to tryu to use");
				System.out.println("1. Color Chooser");
				System.out.println("2. Simple Picture Modify");
				
			}

	}
