import java.util.Scanner;
public class Lab_04_Ex4
{
	public static void main(String[]args)
	{
		Lab_04_Ex4 conversion = new Lab_04_Ex4();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the height in inches:");
		double height = keyboard.nextDouble();
		
		System.out.println("Enter the length in inches:");
		double length = keyboard.nextDouble();
		
		System.out.println("Enter the width in inches:");
		double width = keyboard.nextDouble();
		
		System.out.printf("Your volume in cubic feet is %5.2f\n", conversion.feet(height, length, width));
	}
	public double feet(double h, double l, double w)
	{
		return (h*l*w)*0.000578704;
	}
}