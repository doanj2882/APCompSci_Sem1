import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		Rectangle calculation = new Rectangle();
		System.out.println("Please enter the length:");
		l = kb.nextDouble();
		System.out.println("Please enter the width:");
		w = kb.nextDouble();
		
		calcPerim();
		print();
	}
	
		public static void calcPerim()
		{
			perimeter = (2*(l + w));
		}
		public static void print()
		{
			System.out.printf("The perimeter of your rectangle is: %.5f", perimeter);
		}
}