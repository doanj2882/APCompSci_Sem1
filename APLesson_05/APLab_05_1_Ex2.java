import java.util.Scanner;
public class APLab_05_1_Ex2
{
	static double BMI;
	static String condition;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("How tall are you in inches?");
		double num1 = kb.nextDouble();
		
		System.out.println("How much do you weigh in pounds?");
		double num2 = kb.nextDouble();
		
		BMI = 703*(num2/(num1*num1));
		condition = calcCondish(BMI); 
		
		System.out.println("Your BMI is " + BMI);
		System.out.println("You are " + condition);
	}	

	public static String calcCondish(double bmi)
	{
		if (bmi > 39.9)
			return "Morbidly Obese";
		else if (bmi > 35)
			return "Very Obese";
		else if (bmi > 29.9)
			return "Obese";
		else if (bmi > 25)
			return "Overweight";
		else if (bmi > 18.5)
			return "Normal";
		else
			return "Underweight";
		
	}
}