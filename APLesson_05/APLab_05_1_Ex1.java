import java.util.Scanner;
public class APLab_05_1_Ex1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your 1st class letter grade: ");
		String grade1 = kb.next();
		System.out.println("Enter your 2nd class letter grade: ");
		String grade2 = kb.next();
		System.out.println("Enter your 3rd class letter grade: ");
		String grade3 = kb.next();
		System.out.println("Enter your 4th class letter grade: ");
		String grade4 = kb.next();
		System.out.println("Enter your 5th class letter grade: ");
		String grade5 = kb.next();
		System.out.println("Enter your 6th class letter grade: ");
		String grade6 = kb.next();
		System.out.println("Enter your 7th class letter grade: ");
		String grade7 = kb.next();
		
		double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		
		System.out.printf("Your GPA is %.1f", (gPoints/7));
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		return 0.0;
		
	}
}