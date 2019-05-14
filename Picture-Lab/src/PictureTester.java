/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.zeroBlue();
    swan.explore();
  }
  
  public static void testZeroRed()
	  {
	    Picture swan = new Picture("swan.jpg");
	    swan.explore();
	    swan.zeroRed();
	    swan.explore();
	  }
  
  public static void testZeroGreen()
	  {
	    Picture swan = new Picture("swan.jpg");
	    swan.explore();
	    swan.zeroGreen();
	    swan.explore();
	  }
  
  public static void testKeepOnlyBlue()
	  {
	    Picture swan = new Picture("swan.jpg");
	    swan.explore();
	    swan.keepOnlyBlue();
	    swan.explore();
	    
	  }
  
  public static void testKeepOnlyRed()
	  {
	    Picture swan = new Picture("swan.jpg");
	    swan.explore();
	    swan.keepOnlyRed();
	    swan.explore();
	  }
  
  public static void testKeepOnlyGreen()
	  {
	    Picture swan = new Picture("swan.jpg");
	    swan.explore();
	    swan.keepOnlyGreen();
	    swan.explore();
	  }
  
  public static void testNegate()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.explore();
	  swan.negate();
	  swan.explore();
  }
  
  public static void testGrayscale()
	  {
		  Picture swan = new Picture("swan.jpg");
		  swan.explore();
		  swan.grayscale();
		  swan.explore();
	  }
  
  
  /** Method to test mirrorVertical */
  public  void testMirrorVertical()
  {

    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
   caterpillar.mirrorVerticalRightToLeft();
   caterpillar.explore();
	  
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
		 
	  int width = pixels[0].length;
		 
		 for (int row = 0; row < pixels.length; row++)
			 {
				 for (int col = 0; col < width / 2; col++)
					 {
						 leftPixel = pixels[row][col];
						 rightPixel = pixels[row][width - 1 - col];
						 rightPixel.setColor(leftPixel.getColor());
					 }
			 }
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel leftPixel = null;
	 Pixel rightPixel = null;
	 
	 int width = pixels[0].length;
	 
	 for (int row = 0; row < pixels.length; row++)
		 {
			 for (int col = 0; col < width / 2; col++)
				 {
					 leftPixel = pixels[row][col];
					 rightPixel = pixels[row][width - 1 - col];
					 rightPixel.setColor(leftPixel.getColor());
				 }
		 }
	}
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
	  Picture redMotorcycle = new Picture("redMotorcycle.jpg");
	  redMotorcycle.explore();
	  redMotorcycle.mirrorHorizontal();
	  redMotorcycle.explore();
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorHorizontalBotToTop();
	  snowman.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.explore();
	  koala.mirrorDiagonal();
	  koala.explore();
  }
  

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  

  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	  //Zero Blue, Red, Green : Taylor 
	//testZeroBlue();
    //testZeroRed();
    //testZeroGreen();
    
	  //KeepOnly Blue, Red, Green : Taylor
	//testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    
	  //Negate : Taylor
	//testNegate();
	  
	  
    testGrayscale();
    //testFixUnderwater();
	  
    //testMirrorVertical();

	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
	  
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }


public static void testCopy()
	{
		System.out.println("Hello!");
		
	}
}