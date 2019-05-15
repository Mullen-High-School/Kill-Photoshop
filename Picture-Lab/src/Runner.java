import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;


public class Runner extends Picture
	{
		private static JMenuBar menuBar = new JMenuBar();
		private static JMenu menu = new JMenu("IDK");
		private static Scanner userInput = new Scanner(System.in);
		
		public static void main(String[] args)
			{
//				JFrame frame = new JFrame("Shop Photo");
//				JPanel panel = new JPanel(new GridLayout(4,4));
//				frame.setSize(800,800);
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				menuBar.add(menu);
//				frame.setJMenuBar(menuBar);
//				JButton button = new JButton("Change Photo");
//				button.setVerticalTextPosition(AbstractButton.CENTER);
//				button.setHorizontalTextPosition(AbstractButton.TRAILING);
//				panel.add(button);
//				frame.setContentPane(panel);
//				frame.getRootPane().setDefaultButton(button);
//				frame.setVisible(true);
				
				
				
				System.out.println("Welcome to Shop Photo, the other kind of Photoshop");
				System.out.println("We have two different programs you can use");
				System.out.println("1. Color Chooser");
				System.out.println("2. Picture Modification");
				boolean choosing = true;
				while(choosing)
					{
					int program = userInput.nextInt();
					if(program == 1)
						{
							ColorChooser.main(args);
							choosing = false;
						}
					else if(program == 2)
						{
							Picture.main(args);
							choosing = false;
						}
					else
						{
							System.out.println("Not a valid choice, please choose again.");
						}
					}
				
			}

	}