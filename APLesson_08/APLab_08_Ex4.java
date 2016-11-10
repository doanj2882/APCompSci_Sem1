import java.util.Scanner;
public class APLab_08_Ex4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a your first word: ");
		String word = kb.nextLine();
		int stop = word.length();
		int start = 1;
		tree(word, start, stop);
	}
	
	public static void tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.println(makeCenter(word.substring(0, start)));
			start += 1;
			tree(word, start, stop);
			//continue print formatting
			
		}
	}
	public static String makeCenter(String word)
	{
		if (word.length() >= 20)
		{
			return word;
		}
		else
		{
			return makeCenter(" " + word);
		}
	}
}