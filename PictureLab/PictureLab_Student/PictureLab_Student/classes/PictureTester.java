public class PictureTester
{
  public static void testZeroBlue()
  {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
  }
  
  public static void testMirrorVertical()
  {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
  }
  
  public static void testMirrorTemple()
  {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
  }
  
  public static void testCollage()
  {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
  }
  
  public static void testmyCollage()
  {
		Picture myCollage = new Picture("640x480.jpg");
		myCollage.createMyCollage();
		myCollage.explore();
  }
  
    public static void testCopy()
  {
    Picture copy = new Picture("640x480.jpg");
    copy.createCollage();
    copy.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  public static void testEdgeDetection()
  {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
  }
  
   public static void testNegate()
  {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
  }
  
  public static void testGrayscale()
  {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
  }
  
  public static void testMirrorHorizontal()
  {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorHorizontal();
		caterpillar.explore();
  }
  
  
  public static void testMirrorHorizontalBotToTop()
  {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorHorizontalBottomToTop();
		caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorDiagonal();
		caterpillar.explore();
  }
  
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();		
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	testmyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}