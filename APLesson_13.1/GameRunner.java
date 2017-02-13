public class GameRunner
{
	public static void main(String[]args)
	{
		XBox XB = new XBox("XBox");
	PlayStation PS = new PlayStation("PlayStation");
	PC Comp = new PC("PC");
	
	System.out.println(XB);
	System.out.println(PS);
	System.out.println(Comp);
	}
}