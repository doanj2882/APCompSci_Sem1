import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter distance: ");
		int distance = kb.nextInt();
		System.out.println("Enter hours: ");
		int hours = kb.nextInt();
		System.out.println("Enter minutes: ");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(object.getDistance() + " miles in " + object.getHour() + " hours = " + object.getmph() + " mph");
		
		
	}
}