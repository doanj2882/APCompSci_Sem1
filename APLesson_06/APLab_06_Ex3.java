import java.util.Scanner;
public class APLab_06_Ex3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = kb.next();
		
		for(int i = word.length(); i >= 0; i--)
		{
			System.out.println(word.substring(0,i));
		}
	}
}