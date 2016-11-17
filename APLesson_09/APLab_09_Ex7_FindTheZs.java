import java.util.Scanner;
public class APLab_09_Ex7_FindTheZs
{
	static String[] words;
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray(words);
		
		System.out.println("For all words... ");
		printArray(words);
		System.out.println();
		System.out.println("Only " + hasZs(words) + " contain the letter z");
	}
	public static void fillArray(String[] wd)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words");
		for(int i = 0; i < wd.length; i++)
		{
			wd[i] = kb.next();
		}

	}
	public static void printArray(String[] wds)
	{
		for(String wd : wds)
		{
			System.out.print(wd + " ");
		}
	}
	public static String hasZs(String[] wds)
	{
		String zs = "";
		for(String wd : wds)
		{
			if (wd.indexOf("z")> 0)
			{
				zs += wd + " ";
			}
		}
		return zs;
	}
}