import java.util.Scanner;
public class APLab_05_2_Ex2
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}	
	
	public static void passCheck()
	{
		System.out.println("Please enter your username:");
		String username = kb.next();
		System.out.println("Please enter your password:");
		String password = kb.next();
		
		if (username.equals("doanj2882") && password.equals("mypassword"))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if (username.equals("doanj2882"))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			else if (password.equals("mypassword"))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password is incorrect!");
				passCheck();
			}
			
		}
	}
}