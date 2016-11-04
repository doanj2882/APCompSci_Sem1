import java.util.Scanner;
public class APLab_07_Ex3
{
	static int number;
	static int num = number;
	static int rev = 0;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		avgDigits();
		System.out.println(number + " reverse is " + rev);
	}
	public static void avgDigits()
	{
		int num = number;
		while(num > 0)
		{
			rev=rev*10;
			rev += num%10;
			num /=10;
		}
	}
}
