import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter the length:");
		int l = kb.nextDouble();
		System.out.println("Please enter the width:");
		int w = kb.nextDouble();
		print(calcPerim(l, w));
	}
	public static double calcPerim(int l, int w)
	{
		return perimeter = (2*(l + w));
	}
	public static void print(perimeter)
	{
		System.out.printf("The perimeter of your rectangle is: %.5f", perimeter);
	}
}