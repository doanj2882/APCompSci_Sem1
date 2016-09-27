import java.util.Scanner;
public class Scope
{ //var2 and var3 in this scope therefore no error
	static String var1 = "your numbers are... ";
	static int var2;
	static double var3;
	//indicates that the variable is free-standing and is not attached/requires an object
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter an integer:");
		var2 = kb.nextInt();
		System.out.println("Please enter an integer:");
		var3 = kb.nextDouble();
		method1();
	}
	
	public static void method1()
	{
		System.out.println(var1 + var2 + "and" + var3 + ".");
	}
}