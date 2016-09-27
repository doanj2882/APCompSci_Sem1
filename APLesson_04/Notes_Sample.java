import java.util.Scanner;
public class Notes_Sample
{
	static int var2;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter an integer:");
		int var2 = kb.nextInt();
		method1();
	}
	
	public static void method1(int two)
	{
		System.out.println("The variable is " + var2);
	}
}