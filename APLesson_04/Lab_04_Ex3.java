import java.util.Scanner;
public class Lab_04_Ex3
{
	public static void main(String[]args)
	{
		Lab_04_Ex3 interest = new Lab_04_Ex3();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your intrest rate:");
		double rate = keyboard.nextDouble();
		
		System.out.println("Enter your principle:");
		double principle = keyboard.nextDouble();
		
		System.out.println("Enter the number of times compounded each year:");
		double number = keyboard.nextDouble();
		
		System.out.println("Enter the life of the loan in years:");
		double time = keyboard.nextDouble();
		
		System.out.printf("Your monthly payment will be $ %5.2f\n", interest.payment(rate, principle, number, time));
	}
	
	public static double payment(double r, double p, double n, double t)
	{
		return (p*Math.pow(1+ (r/n), (n*t))/(12*t));
	}
}