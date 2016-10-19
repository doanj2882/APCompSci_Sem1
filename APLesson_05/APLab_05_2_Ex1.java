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
		
		if(choice.equals("a"))
		{
			System.out.println("You see a beached whale. Would you like to..." +
								"\n a. Help the whale into the ocean" +
								"\n b. Leave the whale to die and wither in the sun");
			String choice1 = kb.next();
			
			if(choice1.equals("a"))
			{
				System.out.println("You approach to help the whale. Would you like to..." +
									"\n a. Save the whale and push it back into the ocean by pulling it with ropes!" +
									"\n b. Leave the whale for now and approach the village min the distance for help");
				String choice2 = kb.next();
				
				if(choice2.equals("a"))
				{
					System.out.println("While pulling the whale into the ocean, you sprain your back and are paralyzed from the waste down. The cannablistic tribe warriors eat you in their feast! You lose!");
				}
				else
				{
					System.out.println("You approach the village looking for help. They ambush you before you can get there and eat you in their feast! You lose!");
				}
			}
			else
			{
				System.out.println("You ditch the deathy whale. Would you like to..." +
									"\n a. Chill and sunbathe (ignoring the smell of dead whale)" +
									"\n b. Walk along the beach seeing what you can find");
				String choice3 = kb.next();
				
				if(choice3.equals("a"))
				{
					System.out.println("While taking in the sun, the tide rises and a school of killer clownfish eat you alive! You lose!");
				}
				else
				{
					System.out.println("Walking along the beach, you unknowingly step on a rusty nail. Oh no, tetanus! You lose!");
				}
			}
		}
		else
		{
			System.out.println("You venture into an opening. Would you like to..." +
								"\n a. Pray to the Gods for water" +
								"\n b. Scamper cowardly into away from the opening and into a omninous cave");
			String choice4 = kb.next();
			
			if(choice4.equals("a"))
			{
				System.out.println("You pray to the Gods, but nothing happens. Would you like to..." +
									"\n a. Build a shrine hoping to gain their favor" +
									"\n b. Leave behind a sacrifice of 2 pints of your own blood");
				String choice5 = kb.next();
				
				if(choice5.equals("a"))
				{
					System.out.println("While constructing the monument from solid marble, you miscalculate and break your finger and are helpless against the now attacking tribe warriors! You lose!");
				}
				else
				{
					System.out.println("You draw blood and behold! A shiny new helicopter from the Gods manifests before you and you escape to civilization! You win!");
				}
			}
			else
			{
				System.out.println("You leave and enter the cave. Would you like to..." +
									"\n a. Settle down and build a fire for warmth during the night" +
									"\n b. Explore the cave like Indiana Jones");
				String choice6 = kb.next();
				
				if(choice6.equals("a"))
				{
					System.out.println("While bulding a fire, you awaken the hibernating bear that eats you alive! You lose!");
				}
				else
				{
					System.out.println("The noise you make chanting the Indiana Jones theme song awakens the bat filled corridor that eats you alive! You lose!");
				}
			}
		}
	}
}