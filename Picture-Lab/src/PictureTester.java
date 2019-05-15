
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
    Picture snowman = new Picture("Bo.jpg");
    snowman.explore();
    snowman.zeroBlue();
    snowman.explore();
  }
  public static void keepOnlyBlue()
  {
    Picture snowman = new Picture("Bo.jpg");
    snowman.explore();
    snowman.keepOnlyBlue();
    snowman.explore();
  }
  
  public static void negate()
  {
    Picture snowman = new Picture("Bo.jpg");
    snowman.explore();
    snowman.negate();
    snowman.explore();
  }
  
  public static void grayscale()
  {
	  Picture snowman = new Picture("Bo.jpg");
	  snowman.explore();
	  snowman.grayscale();
	  snowman.explore();
  }
  
  public static void fixUnderwater()
  {
	  Picture water = new Picture("Bo.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void mirrorHorizontal()
  {
	  Picture water = new Picture("Bo.jpg");
	  water.explore();
	  water.mirrorHoriztonal();
	  water.explore();
  }
  
//   public static void mirrorHorizontalBotToTop()
//   {
// 	  Picture water = new Picture("Bo.jpg");
// 	  water.explore();
// 	//  water.mirrorHorizontalBotToTop();
// 	  water.explore();
//   }
  
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("Bo.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void mirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("Bo.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("Bo.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void keepOnlyGreen()
  {
    Picture snowman = new Picture("BoStache.jpg");
    snowman.explore();
    snowman.keepOnlyGreen();
    snowman.explore();
  }
  
  public static void keepOnlyRed()
  {
    Picture snowman = new Picture("BoStache.jpg");
    snowman.explore();
    snowman.keepOnlyRed();
    snowman.explore();
  }
  
  
  
  public static void changeStache()
  {
	  Picture temple = new Picture("BoStache.jpg");
	    temple.explore();
	    temple.changeStache();
	    temple.explore();
  }
  
//  public static void mirrorArms()
//  {
//    Picture temple = new Picture("Bo.jpg");
//    temple.explore();
//    temple.mirrorArms();
//    temple.explore();
//  }
//  
  public static void mirrorDiagonal()
  {
	  Picture caterpillar = new Picture("Bo.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorDiagonal();
	    caterpillar.explore();
  }
  
//  public static void mirrorArms()
//  {
//	  Picture caterpillar = new Picture("Bo.jpg");
//	    caterpillar.explore();
//	    caterpillar.mirrorArms();
//	    caterpillar.explore();
//  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("Bo.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("Bo.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
 
}