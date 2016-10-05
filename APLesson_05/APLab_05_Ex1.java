import java.util.Random;
public class APLab_05_Ex1
{
	static int player;
	static int computer;
	static String Winner;
	public static void main(String[]args)
	{
		Random rand = new Random();
		player = rand.nextInt(6)+1;
		computer = rand.nextInt(6)+1;
		
		rollDice();
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is " + Winner);
	}
	public static void rollDice()
	{
		if (computer > player)
		{
			Winner = "computer";
		}
		if (player > computer)
		{
			Winner = "player";
		}
		
	}
	
}