import java.util.Scanner;
public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter manufacturer: ");
		String manufacturer = kb.nextLine();
		System.out.println("Enter name:");
		String Name = kb.nextLine();
		System.out.println("Do you want to enter category and price");
		String choice = kb.nextLine();
		
		if(choice.equals("n"))
		{
			Inventory object = new Inventory(manufacturer, Name);
			System.out.println(object);
		}
		if(choice.equals("y"))
		{
			System.out.println("Enter category: ");
			String category = kb.nextLine();
			System.out.println("Enter price:");
			int Price = kb.nextInt();
			Inventory object1 = new Inventory(manufacturer, Name, category, Price);
			System.out.println(object1);
		}
	}
}