import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		Average calculation = new Average();
		System.out.println("Please enter the first number:");
		num1 = kb.nextDouble();
		System.out.println("Please enter the second number:");
		num2 = kb.nextDouble();
		System.out.println("Please enter the third number:");
		num3 = kb.nextDouble();
		
		average();
		print();
	}
	
		public static void average()
		{
			avg = (num1 + num2 +num3)/3;
		}
		public static void print()
		{
			System.out.printf("The average of the numbers is: %.5f", avg);
		}
}