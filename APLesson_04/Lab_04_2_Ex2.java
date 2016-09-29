import java.util.Scanner;
public class Lab_04_2_Ex2
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		Lab_04_2_Ex2 calculation = new Lab_04_2_Ex2();
		System.out.println("Please enter the length:");
		l = kb.nextDouble();
		System.out.println("Please enter the width:");
		w = kb.nextDouble();
		
		calcPerim();
		print();
	}
	
		public static void average()
		{
			avg = (num1 + num2 +num3)/3;
		}
		public static void print()
		{
			System.out.println("The perimeter of your rectangle is: " + perimeter);
		}
}