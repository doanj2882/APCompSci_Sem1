import java.util.Scanner;
public class APLab_05_Ex2
{
	static double price1;
	static double price2;
	static double price3;
	static double price4;
	static String item1;
	static String item2;
	static String item3;
	static String item4;
	static double total;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter item 1.");
		String item1 = keyboard.nextLine();
		
		System.out.println("Enter item 1 price.");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Enter item 2.");
		String item2 = keyboard.nextLine();
		
		System.out.println("Enter item 2 price.");
		double price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Enter item 3.");
		String item3 = keyboard.nextLine();
		
		System.out.println("Enter item 3 price.");
		double price3 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Enter item 4.");
		String item4 = keyboard.nextLine();
		
		System.out.println("Enter item 4 price.");
		double price4 = keyboard.nextDouble();
		
		calc();
		
		System.out.println(total);
	}
	public static double calc()
	{
		if ((price1 + price2 + price3 +price4) >= 2000)
		{
			total = (price1 + price2 + price3 +price4)*0.85;
		}
		if ((price1 + price2 + price3 +price4) < 2000)
		{
			total = (price1 + price2 + price3 +price4);
		}
		return total;
	}
	//have yet to create method format
}