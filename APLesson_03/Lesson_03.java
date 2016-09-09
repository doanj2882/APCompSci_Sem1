import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main(String[]arg)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//search fo rthe next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow! " + num + " is perfect. You're pretty handsome." );
	}
}