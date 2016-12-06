public class APLesson_11_Intro2DArrays
{
	public static void main(String[]args)
	{
		int[][] values = new int [4][4];
		values [0][0] = 1;
		values [1][1] = 2;
		values [2][2] = 3;
		values [3][3] = 4;
		
		//print out the array
		for(int i = 0; i < values.length; i++) //for the rows
		{
			for (int j=0; j < values[i].length; j++) // for the column values for the row
			{
				System.out.print(values[i][j]);
			}
			System.out.println();
		}
	}
}
