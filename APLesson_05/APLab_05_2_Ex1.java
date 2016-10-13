import java.util.Scanner;
public class APLab_05_2_Ex1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Your adventure begins now, and you are stranded! Would you like to..." +
							"\n a. Go to sea" +
							"\n b. Stay on land");
		String choice = kb.next();
		
		if(choice.equal("a"))
		{
			System.out.println("You see a beached whale. Would you like to..." +
								"\n a. Help the whale into the ocean" +
								"\n b. Leave the whale to die and wither in the sun");
			String choice = kb.next();
			
			if(choice.equal("a"))
			{
					System.out.println("You approach to help the whale. Would you like to..." +
									"\n a. " +
									"\n b. Leave the whale to die and wither in the sun");
				String choice = kb.next();
			}
	}
}