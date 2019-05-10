import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {

	
		static JFrame frame = new JFrame("Universal Converter v.1");
	public static void main(String[] args) {
	    
		displayJFrame();
		
		//PictureTester.testZeroBlue();
	    //PictureTester.keepOnlyBlue();
		//PictureTester.mirrorDiagonal();
		//PictureTester.mirrorArms();
	    //PictureTester.negate();
	    //PictureTester.grayscale();
	    //PictureTester.fixUnderwater();
	    //PictureTester.testKeepOnlyBlue();
	    //PictureTester.testKeepOnlyRed();
	    //PictureTester.testKeepOnlyGreen();
	    //PictureTester.testNegate();
	    //PictureTester.testGrayscale();
	    //PictureTester.fixUnderwater();
	    //PictureTester.testMirrorVertical();
		//PictureTester.mirrorHorizontal();   //added
		//PictureTester.mirrorHorizontalBotToTop();
	    //PictureTester.mirrorVerticalRightToLeft();
	    //PictureTester.testMirrorTemple();
	    //PictureTester.testMirrorArms();
	    //PictureTester.testMirrorGull();
	    //PictureTester.testMirrorDiagonal();
	    //PictureTester.testCollage();
	    //PictureTester.testCopy();
	    //PictureTester.testEdgeDetection();
	    //PictureTester.testEdgeDetection2();
	    //PictureTester.testChromakey();
	    //PictureTester.testEncodeAndDecode();
	    //PictureTester.testGetCountRedOverValue(250);
	    //PictureTester.testSetRedToHalfValueInTopHalf();
	    //PictureTester.testClearBlueOverValue(200);
	    //PictureTester.testGetAverageForColumn(0);
	  
		
		
		
		
		
	}
			
		public static void displayJFrame()
		{
			//
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 150);
			frame.setLocation(430, 100);
			
			JPanel panel = new JPanel();
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
			frame.add(panel);
			
			JLabel lbl = new JLabel("Select the type of conversion");
			lbl.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			panel.add(lbl);
			
			String [] choices = {"Temperature", "Metric", "Currency", "Time Zones", "Imperial"};
			
			final JComboBox<String> cb = new JComboBox<String>(choices);
			
			cb.setMaximumSize(cb.getPreferredSize()); 
			cb.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			panel.add(cb);
			
			JButton btn = new JButton("OK");
			btn.setAlignmentX(Component.CENTER_ALIGNMENT);
			panel.add(btn);
			
			frame.setVisible(true);
			
			btn.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
//						frame.getContentPane().removeAll();
//					    frame.repaint();
//						frame.getContentPane().setLayout(new FlowLayout());
						switch(cb.getSelectedIndex())
						{
							case 0:
//								TempConversions.convertTemp();
//								break;
//							case 1:
//								MetricConversions.metricConversions();
//								break;
//							case 2:
//								Currency.converterStart();
//								break;
//							case 3: 
//								TimeZones.takeInput();
//								break;
//							case 4:
//								ImperialConversions.imperialConversion();
//								break;
							
						}
					}
				}
			);
		}
		
	
		

	}

