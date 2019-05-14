import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
//
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {

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
					System.out.println("(3) negate");
					System.out.println("(4) grayscale");
					int choice = userInput3.nextInt();
					
					switch (choice)
					{
					case 1:
					{
						PictureTester.keepOnlyBlue();
					}
					
					case 2:
					{
						PictureTester.testZeroBlue();
					}
					
					case 3:
					{
						PictureTester.negate();
					}
					
					case 4:
					{
						PictureTester.grayscale();
					}
					
					}
	
					
				}
				case 2:
				{
					Scanner userInput3 = new Scanner(System.in);
					System.out.println("(1) mirror horizontal");
					System.out.println("(2) mirror horizontal bottom to top");
					System.out.println("(3) mirror vertical ");
					System.out.println("(4) mirror vertical right to left");
					System.out.println("(5) mirror diagonal");
					int choice = userInput3.nextInt();
				
				
						switch (choice)
						{
						case 1:
						{
							PictureTester.mirrorHorizontal();
						}
						
						case 2:
						{
							PictureTester.mirrorHorizontalBotToTop();
						}
						
						case 3:
						{
							 PictureTester.testMirrorVertical();
						}
						
						case 4:
						{
							 PictureTester.mirrorVerticalRightToLeft();
						}
						
						case 5:
						{
						//	PictureTester.testMirrorDiagonal();
						}
					
					}
			
				}
			
		
		}
		
//		PictureTester.testZeroBlue();
	//  this works  PictureTester.keepOnlyBlue();
	//	PictureTester.mirrorDiagonal();
	//	this works	PictureTester.mirrorArms();
	//	this works 	PictureTester.negate();
	//	this works	PictureTester.grayscale();
	 // this works  	PictureTester.fixUnderwater();

//	    PictureTester.testKeepOnlyRed(); ----- eric
//	    PictureTester.testKeepOnlyGreen(); ------ eric 
//	    PictureTester.testMirrorVertical(); -------- eric
		
		
//		 this works i hope 		PictureTester.mirrorHorizontal();
//		 this works  i hope 		PictureTester.mirrorHorizontalBotToTop();
//		this works	    PictureTester.mirrorVerticalRightToLeft();
//		this works 		PictureTester.testMirrorTemple();
//    PictureTester.testMirrorArms();
//	    PictureTester.testMirrorGull();
//	    PictureTester.testMirrorDiagonal();
//    PictureTester.testCollage();
//	    PictureTester.testCopy();
//    this works	    PictureTester.testEdgeDetection();
//		this does not work	    PictureTester.testEdgeDetection2(); 		----- - carlos 
// 		this does not work	    PictureTester.testChromakey(); 		----- carlos 
//		this does not work	    PictureTester.testEncodeAndDecode(); 		------ carlos
//		this does not work	    PictureTester.testGetCountRedOverValue(250);			--- carlos 
// this does not work	    PictureTester.testSetRedToHalfValueInTopHalf(); 			---- coco
// this does not work	    PictureTester.testClearBlueOverValue(200);			----- coco
//	 this does not work    PictureTester.testGetAverageForColumn(0);				---coco
//		
	}	

}

