import java.util.Scanner; //import Statement

public class Lab_04_Ex1
{
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
		
		System.out.println(":::::::::::::::Receipt:::::::::::::::");
		Lab_04_Ex1 form = new Lab_04_Ex1();
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		System.out.println();
		
		form.format("Subtotal:", price1 + price2 + price3);
		
		form.format("Tax:", (price1 + price2 + price3)*0.08);
		
		form.format("Total:", (price1 + price2 + price3)*1.08);
		
		System.out.println();
		
		System.out.println("______________________________________");
		
		System.out.println("*Thanks for your support*");
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n%15s ....... %10.2f", item, price);
	}
	
}