import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter hair: ");
		String hair = kb.next();
		System.out.println("Enter eyes: ");
		String eyes = kb.next();
		System.out.println("Enter skin: ");
		String skin = kb.next();
	
	Human object = new Human(hair, eyes, skin);
	
	System.out.println("My info......");
	System.out.println("Hair: " + object.getHair());
	System.out.println("Eyes: " + object.getEyes());
	System.out.println("Skin: " + object.getSkin());
	
	object.setHES("blonde", "blue" , "freckles");
	
	System.out.println("");
	System.out.println("Friends info......");
	System.out.println("Hair: " + object.getHair());
	System.out.println("Eyes: " + object.getEyes());
	System.out.println("Skin: " + object.getSkin());
	}
}