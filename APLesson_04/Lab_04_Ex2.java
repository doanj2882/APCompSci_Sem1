import java.util.Scanner; //import Statement

public class Lab_04_Ex2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String nameFirst = keyboard.next();
		
		System.out.println("Enter your last name:");
		String nameLast = keyboard.next();
		
		keyboard.nextLine();
		System.out.println("Enter your title:");
		String title = keyboard.nextLine();
		
		System.out.println("Enter the school site:");
		String school = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String year = keyboard.nextLine();
		
		System.out.println("What is your subject?");
		String subject = keyboard.nextLine();
		
		System.out.println("***************************************");
		Lab_04_Ex2 form = new Lab_04_Ex2();
		
		form.format(school, year);
		form.format(nameFirst, nameLast);
		form.format(title, subject);
		System.out.println("***************************************");
		
	}
	
	public void format(String column1, String column2)
	{
		System.out.printf("*%15s%20s  *\n", column1, column2);
	}
}	