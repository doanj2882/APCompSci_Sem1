import java.util.Scanner; //import Statement

public class Lab_03_Ex2
{
	public static void main(String[]arg)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How tall are you in inches?");
		
		//search fo rthe next integer that the user enters
		double num1 = keyboard.nextDouble();
		
		//prompt for user input
		System.out.println("How much do you weigh in pounds?");
		
		//search fo rthe next integer that the user enters
		double num2 = keyboard.nextDouble();
		
		double BMI = num2/num1;
		System.out.println("Your BMI is " + BMI);
	}
}