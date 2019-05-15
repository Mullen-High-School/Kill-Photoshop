
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {

	static int blue = 0;
	 static  int red = 0;
	 static  int green = 0;
	
	public static void main(String[] args) {

		System.out.println("Here is a photo of Bo. What would you like to do with it?");
		
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("(1) Change coloring");
			System.out.println("(2) Rotate/Reflect the image");
			int userAlteration = userInput2.nextInt();
			
			switch (userAlteration)
			{
				case 1: 
				{
					Scanner userInput3 = new Scanner(System.in);
					System.out.println("(1) keep only blue");
					System.out.println("(2) remove blue");
					//System.out.println("(3) keep only red");
					//System.out.println("(4) keep only green");
					System.out.println("(3) negate");
					System.out.println("(4) grayscale");
					System.out.println("(5) change stache");
					int choice1 = userInput3.nextInt();
					
					switch (choice1)
					{
					case 1:
					{
						PictureTester.keepOnlyBlue();
						break;
						
					}
					
					case 2:
					{
						PictureTester.testZeroBlue();
						break;
					}
		
//					case 3:
//					{
//						PictureTester.keepOnlyRed();
//						break;
//					}
//
//					case 4:
//					{
//						PictureTester.keepOnlyGreen();
//						break;
//					}
			case 3:
					{
						PictureTester.negate();
						break;
					}
					
					case 4:
					{
						PictureTester.grayscale();
						break;
					}
					case 5:
					{
						
					    Scanner Blue1 = new Scanner(System.in);
						System.out.println("Enter blue value");
						 blue = Blue1.nextInt();
						 
						 Scanner red1 = new Scanner(System.in);
						System.out.println("Enter red value");
						 red = red1.nextInt();
						    
						    Scanner green1 = new Scanner(System.in);
						System.out.println("Enter green value");
						 green = green1.nextInt();
						  
						  
						PictureTester.changeStache();
					}
				}
	
					break;
				}
				case 2:
				{
					Scanner userInput4 = new Scanner(System.in);
					System.out.println("(1) mirror horizontal");
					//System.out.println("(2) mirror horizontal bottom to top");
					System.out.println("(2) mirror vertical ");
					System.out.println("(3) mirror vertical right to left");
				//	System.out.println("(5) mirror diagonal");
					int choice = userInput4.nextInt();
				
				
						switch (choice)
						{
						case 1:
						{
							PictureTester.mirrorHorizontal();
							break;
						}
						
//						case 2:
//						{
//							//PictureTester.mirrorHorizontalBotToTop();
//							break;
//						}
//						
						case 2:
						{
							 PictureTester.testMirrorVertical();
							 break;
						}
						
						case 3:
						{
							 PictureTester.mirrorVerticalRightToLeft();
							 break;
						}
						
//						case 5:
//						{
//						//	PictureTester.testMirrorDiagonal();
//							break;
//						}
//					
					}
			
				}
			
		
		}
		
//		PictureTester.testZeroBlue();
//  	this works  PictureTester.keepOnlyBlue();
//		PictureTester.mirrorDiagonal();
//		PictureTester.mirrorArms();
//		PictureTester.negate();
//		PictureTester.grayscale();
//		PictureTester.fixUnderwater();
//	    PictureTester.testKeepOnlyRed();
//	    PictureTester.testKeepOnlyGreen();
//	    PictureTester.testMirrorVertical();
//		PictureTester.mirrorHorizontal();
//		PictureTester.mirrorHorizontalBotToTop();
//		PictureTester.mirrorVerticalRightToLeft();
//		PictureTester.testMirrorTemple();
//   	PictureTester.testMirrorArms();
//	    PictureTester.testMirrorGull();
//	    PictureTester.testMirrorDiagonal();
//    	PictureTester.testCollage();
//	    PictureTester.testCopy();
//    	PictureTester.testEdgeDetection();
//		PictureTester.testEdgeDetection2(); 
// 		PictureTester.testChromakey(); 
//		PictureTester.testEncodeAndDecode(); 
//		PictureTester.testGetCountRedOverValue(250);
// 		PictureTester.testSetRedToHalfValueInTopHalf(); 
// 		PictureTester.testClearBlueOverValue(200);
//	 	PictureTester.testGetAverageForColumn(0);
//		
	}	

}

