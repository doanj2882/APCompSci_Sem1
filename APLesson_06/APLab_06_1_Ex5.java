import java.util.Scanner;
public class APLab_06_1_Ex5
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the integer: ");
		int num = kb.nextInt();
		System.out.println("Please enter the increment: ");
		int inc = kb.nextInt();

		for(int i = inc; i <= num; i+=inc)
		{
			System.out.print(i + " ");
		}

	}
}