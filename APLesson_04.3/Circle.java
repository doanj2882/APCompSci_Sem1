import java.util.Scanner;
public class Circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter the radius of your Circle:");
		double r = kb.nextDouble();
		
		print(calcArea(r));
	}
	
		public static double calcArea(double r)
		{
			return 3.14*(r*r);
		}
		public static void print(double area)
		{
			System.out.printf("The area of your cube is: %.5f", area);
		}
}