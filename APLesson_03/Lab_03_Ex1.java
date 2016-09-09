import java.util.Scanner; //import Statement

public class Lab_03_Ex1
{
	public static void main(String[]arg)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		//search for the next response that the user enters
		String name = keyboard.next();
		
		//print the results...
		System.out.println("Really? " + name + " Wow you noob, lol." );
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//search fo rthe next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Bruh " + num + " you can't even drive, lmao" );
		
		//prompt for user input
		System.out.println("What do you do for fun? ");
		
		//search for the next response that the user enters
		String fun = keyboard.next();
		
		//print the results...
		System.out.println("Really? You are a nerd." );
		
		//prompt for user input
		System.out.println("What kind of music do you listen to?");
		
		//search for the next response that the user enters
		String music = keyboard.next();
		
		//print the results...
		System.out.println("No way?! " + music + " is the music of the devil." );
		
		//prompt for user input
		System.out.println("How many siblings do you have? ");
		
		//search fo rthe next integer that the user enters
		int num1 = keyboard.nextInt();
		
		//print the results...
		System.out.println(num1 + "? I bet they wished they were an only child." );
		
		//prompt for user input
		System.out.println("What do you want to be when you grow up? ");
		
		//search for the next response that the user enters
		String job = keyboard.next();
		
		//print the results...
		System.out.println("I bet you had to look up how to spell " + job);
	}
}