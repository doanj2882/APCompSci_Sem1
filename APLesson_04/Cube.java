import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		Cube calculation = new Cube();
		System.out.println("Please enter the length of one of the sides of your cube:");
		side = kb.nextDouble();
		
		surfaceArea();
		print();
	}
	
		public static void surfaceArea()
		{
			sa = 6*(side*side);
		}
		public static void print()
		{
			System.out.printf("The surface area of your cube is: %.5f", sa);
		}
}