public class APLab_06_1_Ex8
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 4);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String word, int times)
	{
		for(int i = 1; i <= times; i++)
		{
			System.out.print(word + " " );
		}	
			System.out.println();
		
	}
}