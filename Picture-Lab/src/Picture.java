
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;
import java.io.File;
import java.util.Scanner; // resolves problem with java.awt.List and java.util.List
/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
	{
  /**
   * Constructor that takes no arguments 
   */
	public Picture ()
		{
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
		super();  
		}
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
	public Picture(String fileName)
		{
    // let the parent class handle this fileName
		super(fileName);
		}
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
	public Picture(int height, int width)
		{
    // let the parent class handle this width and height
		super(width,height);
		}
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
	public Picture(Picture copyPicture)
		{
    // let the parent class do the copy
		super(copyPicture);
		}
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
	public Picture(BufferedImage image)
		{
		super(image);
		}
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
	public String toString()
		{
	    String output = "Picture, filename " + getFileName() + 
	      " height " + getHeight() 
	      + " width " + getWidth();
	    return output; 
		}
  /** Method to set the blue to 0 */
	public void zeroBlue()
		{
	    Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    	{
	    	for (Pixel pixelObj : rowArray)
	    		{
	    		pixelObj.setBlue(0);
	    		}
	    	}
		}
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
	public void mirrorVertical()
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
  /** Mirror just part of a picture of a temple */
	public void mirrorTemple()
		{
	    int mirrorPoint = 276;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
	    for (int row = 27; row < 97; row++)
	    	{
      // loop from 13 to just before the mirror point
	    	for (int col = 13; col < mirrorPoint; col++)
	    		{
		        leftPixel = pixels[row][col];      
		        rightPixel = pixels[row]                       
		                         [mirrorPoint - col + mirrorPoint];
		        rightPixel.setColor(leftPixel.getColor());
	    		}
	    	}
		}
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
	public void copy(Picture fromPic, int startRow, int startCol)
		{
	    Pixel fromPixel = null;
	    Pixel toPixel = null;
	    Pixel[][] toPixels = this.getPixels2D();
	    Pixel[][] fromPixels = fromPic.getPixels2D();
	    for (int fromRow = 0, toRow = startRow; 
	         fromRow < fromPixels.length &&
	         toRow < toPixels.length; 
	         fromRow++, toRow++)
	    	{
		      for (int fromCol = 0, toCol = startCol; 
		           fromCol < fromPixels[0].length &&
		           toCol < toPixels[0].length;  
		           fromCol++, toCol++)
		    	  {
			        fromPixel = fromPixels[fromRow][fromCol];
			        toPixel = toPixels[toRow][toCol];
			        toPixel.setColor(fromPixel.getColor());
		    	  }
	    	}   
		}
	
	public void keepOnlyBlue(){
		Pixel[][] pixels = this.getPixels2D();
		 for (Pixel[] rowArray : pixels)
		 {
		 for (Pixel pixelObj : rowArray)
		 {
		 pixelObj.setGreen(0);
		 pixelObj.setRed(0);
		 }
		 }
	}
	
	public void negate(){
		Pixel[][] pixels = this.getPixels2D();
		 for (Pixel[] rowArray : pixels)
		 {
		 for (Pixel pixelObj : rowArray)
		 {
		 pixelObj.setGreen(255 - pixelObj.getGreen());
		 pixelObj.setRed(255 - pixelObj.getRed());
		 pixelObj.setBlue(255 - pixelObj.getBlue());
		 }
		 }
	}
	
	public void fixUnderwater(){
		 
		  Pixel[][] pixels = this.getPixels2D();
			 for (Pixel[] rowArray : pixels)
			 {
			 for (Pixel pixelObj : rowArray){
		 pixelObj.setRed(pixelObj.getRed() + 200);
			 }
			 }
			 }
	public void mirrorVerticalRightToLeft(){
		Pixel[][] pixels = this.getPixels2D();
		 Pixel leftPixel = null;
		 Pixel rightPixel = null;
		 int width = pixels[0].length;
		 for (int row = 0; row < pixels.length; row++)
		 {
		 for (int col = 0; col < width / 2; col++)
		 {
			 rightPixel = pixels[row][col];
		  leftPixel = pixels[row][width - 1 - col];
		 rightPixel.setColor(leftPixel.getColor());
		 }
		 } 
	}
	
	public void mirrorHorizontal(){
		Pixel[][] pixels = this.getPixels2D();
		 Pixel topPixel = null;
		 Pixel bottomPixel = null;
		 int width = pixels.length;
		 for (int row = 0; row < width/2; row++)
		 {
		 for (int col = 0; col < pixels[0].length; col++)
		 {
			 topPixel = pixels[row][col];
		  bottomPixel = pixels[width - 1 - row][col];
		 bottomPixel.setColor(topPixel.getColor());
		 }
		 }
	}
	
	public void mirrorHorizontalBotToTop(){
		Pixel[][] pixels = this.getPixels2D();
		 Pixel topPixel = null;
		 Pixel bottomPixel = null;
		 int width = pixels.length;
		 for (int row = 0; row < width/2; row++)
		 {
		 for (int col = 0; col < pixels[0].length; col++)
		 {
			 topPixel = pixels[row][col];
		  bottomPixel = pixels[width - 1 - row][col];
		 topPixel.setColor(bottomPixel.getColor());
		 }
		 }
	}
	
	public void grayscale(){
		Pixel[][] pixels = this.getPixels2D();
		 for (Pixel[] rowArray : pixels)
		 {
		 for (Pixel pixelObj : rowArray)
		 {
		int average = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed()) / 3;
		pixelObj.setBlue(average);
		pixelObj.setGreen(average);
		pixelObj.setRed(average);
		 
		 }
		 }
	}

	
	
	
  /** Method to create a collage of several pictures */
	public void createCollage()
		{
	    Picture flower1 = new Picture("flower1.jpg");
	    Picture flower2 = new Picture("flower2.jpg");
	    this.copy(flower1,0,0);
	    this.copy(flower2,100,0);
	    this.copy(flower1,200,0);
	    Picture flowerNoBlue = new Picture(flower2);
	    flowerNoBlue.zeroBlue();
	    this.copy(flowerNoBlue,300,0);
	    this.copy(flower1,400,0);
	    this.copy(flower2,500,0);
	    this.mirrorVertical();
	    this.write("collage.jpg");
		}
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
	public void edgeDetection(int edgeDist)
		{
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    Color rightColor = null;
	    for (int row = 0; row < pixels.length; row++)
	    	{
	    	for (int col = 0; col < pixels[0].length-1; col++)
	    		{
		        leftPixel = pixels[row][col];
		        rightPixel = pixels[row][col+1];
		        rightColor = rightPixel.getColor();
		        if (leftPixel.colorDistance(rightColor) > 
		            edgeDist)
		        		leftPixel.setColor(Color.BLACK);
		        else
		        	leftPixel.setColor(Color.WHITE);
	    		}
	    	}
		}
	
	
	public void mirrorDiagonal()
	{
		Pixel[][] pixels = this.getPixels2D();
	    Pixel botLeft = null;
	    Pixel topRight = null;
	    int width = pixels.length;
	    for (int row = 0; row < width; row++)
	    	{
	    	for (int col = 0; col != row && col < width; col++)
	    		{
		        botLeft = pixels[row][col];
		        topRight = pixels[col][row];
		        topRight.setColor(botLeft.getColor());
	    		}
	    	}
	}
	
	public void mirrorArms()
	{
		int mirrorPoint = 170;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
    
	    for (int row = 154; row < 200; row++)
	    	{
	    	for (int col = 91; col < mirrorPoint; col++)
	    		{
		        leftPixel = pixels[row][col];      
		        rightPixel = pixels[mirrorPoint - row + mirrorPoint][col];
		        
		        rightPixel.setColor(leftPixel.getColor());
	    		}
	    	}
	}
	
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
	public static void main(String[] args) 
		{
			Scanner userInput = new Scanner(System.in);
			Picture userPicture;
			System.out.println("Choose a picture you would like to modify");
			File file = new File("C:\\Users\\skywi\\git\\Kill-Photoshop\\Picture-Lab\\images");
			File[] files = file.listFiles();
			int i = 1;
			for(File f: files)
				{
					System.out.println(i + ". " + f.getName());
					i++;
				}
			int pictureChoice = userInput.nextInt();
			if(pictureChoice == 1)
				{
					userPicture = new Picture("640x480.jpg");
				}
			else if(pictureChoice == 2)
				{
					userPicture = new Picture("7inX95in.jpg");
				}
			else if(pictureChoice == 3)
				{
					userPicture = new Picture("arch.jpg");
				}
			else if(pictureChoice == 4)
				{
					userPicture = new Picture("barbaraS.jpg");
				}
			else if(pictureChoice == 5)
				{
					userPicture = new Picture("beach.jpg");
				}
			else if(pictureChoice == 6)
				{
					userPicture = new Picture("blue-mark.jpg");
				}
			else if(pictureChoice == 7)
				{
					userPicture = new Picture("blueMotorcycle.jpg");
				}
			else if(pictureChoice == 8)
				{
					userPicture = new Picture("butterfly1.jpg");
				}
			else if(pictureChoice == 9)
				{
					userPicture = new Picture("caterpillar.jpg");
				}
			else if(pictureChoice == 10)
				{
					userPicture = new Picture("collage.jpg");
				}
			else if(pictureChoice == 11)
				{
					userPicture = new Picture("CumberlandIsland.jpg");
				}
			else if(pictureChoice == 12)
				{
					userPicture = new Picture("femaleLionAndHall.jpg");
				}
			else if(pictureChoice == 13)
				{
					userPicture = new Picture("flower1.jpg");
				}
			else if(pictureChoice == 14)
				{
					userPicture = new Picture("flower2.jpg");
				}
			else if(pictureChoice == 15)
				{
					userPicture = new Picture("gorge.jpg");
				}
			else if(pictureChoice == 16)
				{
					userPicture = new Picture("jenny-red.jpg");
				}
			else if(pictureChoice == 17)
				{
					userPicture = new Picture("KatieFancy.jpg");
				}
			else if(pictureChoice == 18)
				{
					userPicture = new Picture("kitten2.jpg");
				}
			else if(pictureChoice == 19)
				{
					userPicture = new Picture("koala.jpg");
				}
			else if(pictureChoice == 20)
				{
					userPicture = new Picture("moon-surface.jpg");
				}
			else if(pictureChoice == 21)
				{
					userPicture = new Picture("msg.jpg");
				}
			else if(pictureChoice == 22)
				{
					userPicture = new Picture("redMotorcycle.jpg");
				}
			else if(pictureChoice == 23)
				{
					userPicture = new Picture("robot.jpg");
				}
			else if(pictureChoice == 24)
				{
					userPicture = new Picture("seagull.jpg");
				}
			else if(pictureChoice == 25)
				{
					userPicture = new Picture("snowman.jpg");
				}
			else if(pictureChoice == 26)
				{
					userPicture = new Picture("swan.jpg");
				}
			else if(pictureChoice == 27)
				{
					userPicture = new Picture("temple.jpg");
				}
			else if(pictureChoice == 28)
				{
					userPicture = new Picture("thruDoor.jpg");
				}
			else if(pictureChoice == 29)
				{
					userPicture = new Picture("Thumbs.db");
				}
			else if(pictureChoice == 30)
				{
					userPicture = new Picture("wall.jpg");
				}
			else if(pictureChoice == 31)
				{
					userPicture = new Picture("water.jpg");
				}
			else
				{
					userPicture = new Picture("whiteFlower.jpg");
				}
			
		userPicture.explore();	
	    System.out.println("What would you like to do with this picture?");
	    System.out.println("1. Zero Blue");
	    System.out.println("2. Keep Only Blue");
	    System.out.println("3. Mirror Vertical");
	    System.out.println("4. Mirror Horizontal");
	    System.out.println("5. Mirror Diagonal");
	    System.out.println("6. Negate");
	    System.out.println("7. Gray Scale");
	    System.out.println("8. Fix Underwater");
	    System.out.println("9. Collage");
	    System.out.println("10. Edge Detection");
	    
	    int modifying = userInput.nextInt();
	    if(modifying == 1)
	    	{
	    		userPicture.zeroBlue();
	    	}
	    else if(modifying == 2)
	    	{
	    		userPicture.keepOnlyBlue();
	    	}
	    else if(modifying == 3)
	    	{
	    		userPicture.mirrorVertical();
	    	}
	    else if(modifying == 4)
	    	{
	    		userPicture.mirrorHorizontal();
	    	}
	    else if(modifying == 5)
	    	{
	    		userPicture.mirrorDiagonal();
	    	}
	    else if(modifying == 6)
	    	{
	    		userPicture.negate();
	    	}
	    else if(modifying == 7)
	    	{
	    		userPicture.grayscale();
	    	}
	    else if(modifying == 8)
	    	{
	    		userPicture.fixUnderwater();
	    	}
	    else if(modifying == 9)
	    	{
	    		userPicture.createCollage();
	    	}
	    else 
	    	{
	    		userPicture.edgeDetection(10);
	    	}
	   userPicture.explore();
	   
	   Scanner userInput1 = new Scanner(System.in);
	   System.out.println("Do you want to do something else? (Yes or No)");
	   String again = userInput1.nextLine();
	   if(again.toLowerCase().equals("yes"))
		   Runner.main(args);
	   else
		   System.exit(0);
	   
		}
	} // this } is the end of class Picture, put all new methods before this

