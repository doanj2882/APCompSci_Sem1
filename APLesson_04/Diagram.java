import java.util.Scanner;
public class Diagram
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		Diagram calcPerim = new Diagram();
		
		System.out.println("Please enter the length:");
		int length = kb.nextInt();
		
		System.out.println("Please enter the width:");
		int width = kb.nextInt();
		
		int perimeter = calcPerim(width, length);
		
		System.out.println("Your perimeter is " + perimeter + "ft.");
	}
	
		public static int calcPerim(int w, int l)
		{
			return (2*(l + w));
		}
}