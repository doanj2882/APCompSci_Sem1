import java.util.Scanner; //import Statement

public class Lab_03_Ex3
{
	public static void main(String[]arg)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How many points do you have including weighted credit in total of all your classes?");
		
		//search fo rthe next integer that the user enters
		double num1 = keyboard.nextDouble();
		
		//prompt for user input
		System.out.println("How many graded classes are you taking?");
		
		//search fo rthe next integer that the user enters
		double num2 = keyboard.nextDouble();
		
		double GPA = num1/num2;
		System.out.println("Your GPA is " + GPA);
	}
}