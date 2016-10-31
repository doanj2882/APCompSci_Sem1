Question 1
public static String calcBond(double one, double two)
{
	if (one > two)
	{
		if (one-two >= 1.7)
		{
			return "ionic";
		}
		return "covalent";
	}
	else
	{
		if (two-one >= 1.7)
		{
			return "ionic";
		}
		return "covalent";
	}
		
}

Question 2
D because n as 0 would return "n != 0" as false, resulting in Statement 2 running not 1

Question 3
D because if num is 22 it enters "if (num > 0)"  but fails "if (num % 5 == 0)" so it enters the "else" resulting in "22 is negative"

Question 4
A because x = 30 enters "if (x >= 0)" and enters "if (x <= 100)" it resulting in y= 30*3 = 90 but fails "if (y < 50)" so x = 30, y = 90 (redefined in the scope)

Question 5
C because only !(A || B || C) requires all being false if one were be be true then it woudl result to the entire expression being true due to the "or" statement

Question 6
D because in !(a <= b) && (a * b > 0) to get the left side to result true (and the paranthesis to be false) the inverse of the function must be true "a > b" and b must be positive "b > 0" because the right side cannot be true with a or b being negative

Question 7
A because if c < a is false it makes ((c == a * b) && (c < a)) entirely false resulting in an overall tru statement

Question 8
C because a== b is false it fulfils the left side but it depends on n to see if the right side will result in true therefore either maybe true

Question 9
D because the conditions fail all previous if statements preseeding the final else therefore it returns "no"

Question 10
nested "if" statements need brackets to contain the code and allow it to run. statements with only one like of code can run without brackets 