import java.util.Scanner;
public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter the length of one of the sides of your cube:");
		double side = kb.nextDouble();

		print(surfaceArea(side));
	}
	
		public static double surfaceArea(double side)
		{
			return 6*(side*side);
		}
		public static void print(double sa)
		{
			System.out.printf("The surface area of your cube is: %.5f", sa);
		}
}