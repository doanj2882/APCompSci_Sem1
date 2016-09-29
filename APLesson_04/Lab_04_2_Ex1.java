import java.util.Scanner;
public class Lab_04_2_Ex1
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		Lab_04_2_Ex1 calculation = new Lab_04_2_Ex1();
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
			System.out.println("The perimeter of your rectangle is: " + perimeter);
		}
}