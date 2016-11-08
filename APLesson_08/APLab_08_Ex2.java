import java.util.Scanner;
public class APLab_08_Ex2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a your first word: ");
		String word1 = kb.nextLine();
		System.out.println("Please enter a your second word: ");
		String word2 = kb.nextLine();
		System.out.println("Please enter a your third word: ");
		String word3 = kb.nextLine();
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	
	public static String makeCenter(String word)
	{
		if (word.length() >= 20)
		{
			return word;
		}
		else
		{
			return makeCenter(" " + word + " ");
		}
	}
}