import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class APLab_10_Ex2_ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		System.out.println(doEquation(equation));
	}	
	public static ArrayList<String> doEquation(ArrayList <String> eqn)	
	{	
		int i = 0;
		while(i < eqn.size())
		{
			if(i < eqn.size() && (eqn.get(i).equals("+") || eqn.get(i).equals("-")))
			{
				if (eqn.get(i).equals("+"))
				{	
					eqn.set(i, "" + (Integer.parseInt(eqn.get(i-1)) + Integer.parseInt(eqn.get(i+1))));
				}
				else
				{
					eqn.set(i, "" + (Integer.parseInt(eqn.get(i-1)) - Integer.parseInt(eqn.get(i+1))));
				}
				eqn.remove(i-1);
				eqn.remove(i);
			}
			else
				i++;	
		}
		
		while(i < eqn.size())
		{
			if(i < eqn.size() && (eqn.get(i).equals("*") || eqn.get(i).equals("/")))
			{
				if (eqn.get(i).equals("*"))
				{	
					eqn.set(i, "" + (Integer.parseInt(eqn.get(i-1)) * Integer.parseInt(eqn.get(i+1))));
				}
				else
				{
					eqn.set(i, "" + (Integer.parseInt(eqn.get(i-1)) / Integer.parseInt(eqn.get(i+1))));
				}
				eqn.remove(i-1);
				eqn.remove(i);
			}
			else
				i++;	
		}
		return eqn;
	}
}