import java.util.Scanner;

public class Space_Shooter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter you target: ");
		int target = kb.nextInt();
		int enemyLoc = (int)(Math.random()*3)+1;
		
		if (target == enemyLoc)
			System.out.println("It's a hit!");
		else
			System.out.println("Keep trying!");
	}
}