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
	static double discount;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter item 1.");
		 item1 = keyboard.nextLine();
		
		System.out.println("Enter item 1 price.");
		 price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Enter item 2.");
		 item2 = keyboard.nextLine();
		
		System.out.println("Enter item 2 price.");
		 price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Enter item 3.");
		 item3 = keyboard.nextLine();
		
		System.out.println("Enter item 3 price.");
		 price3 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Enter item 4.");
		 item4 = keyboard.nextLine();
		
		System.out.println("Enter item 4 price.");
		 price4 = keyboard.nextDouble();
		
		double subtotal = (price1 + price2 + price3 +price4);
		discount();
		double tax = (subtotal - discount)*0.08;
		double total = (subtotal - discount) + tax;
		
		System.out.println("<<<<<<<<<<<<<<Reciept>>>>>>>>>>>>>>>");
		
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		
		format("Subtotal:", subtotal);
		format("Discount:", discount);
		format("Tax:", tax);
		format("Total:", total);
		
		System.out.println("\n____________________________________");
		System.out.println("Thank you for shopping with us!");
	}
	public static double discount()
	{
		if ((price1 + price2 + price3 +price4) >= 2000)
		{
			discount = (price1 + price2 + price3 +price4)*0.15;
		}
		if ((price1 + price2 + price3 +price4) < 2000)
		{
			discount = 0;
		}
		return discount;
	}
	public static void format(String item, double price)
	{
		System.out.printf("\n%15s ....... %10.2f", item, price);
	}
}