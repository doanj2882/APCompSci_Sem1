import java.util.Scanner;
public class APLab_06_Ex4
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the size of the table: ");
		int table = kb.nextInt();
		System.out.println("Please enter an integer: ");
		int integer = kb.nextInt();
		for(int i = 1; i <=table; i++)
		{
			System.out.printf("%5d       %5d\n", i, i*integer);
		}

	}
}