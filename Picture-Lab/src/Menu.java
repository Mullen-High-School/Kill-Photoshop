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
			System.out.println("(1) Change/alter the coloring");
			System.out.println("(2) Rotate the image");
			System.out.println("(3) ");
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
		PictureTester.mirrorHorizontalBotToTop();
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

}

