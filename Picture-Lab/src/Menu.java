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

	public static void main(String[] args) {
	    
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which picture would you like to use?");
		System.out.println("(1) Dolphin");
		System.out.println("(2) Mr. McGuire");
		System.out.println("(3) Something");
		System.out.println("(4) Something else");
		System.out.println("(5) Something cool");
		int userChoice = userInput.nextInt();
		
		switch (userChoice)
		{
		
		case 1:
		{
			//dolphin
			
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("(1) Change coloring");
			System.out.println("(2) Rotate the image");
			System.out.println("(3) Reflect the image");
			int userAlteration = userInput2.nextInt();
			
			break;
		}
		
		case 2:
		{
			//Mr. McGuire
			
			break;
		}
		
		case 3:
		{
			//something
			
			break;
		}
		
		case 4:
		{
			//something else
			
			break;
		}
		
		case 5:
		{
			//something cool 
			
			break;
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

