public class APLesson_11_FillingArrayWithLoops
{
	public static void main(String[]args)
	{
		int[][] values = new int [4][4];
		
//		int num = 1; to print horizontally
//		for(int i = 0; i < values.length; i++)
//		{
//			for (int j = 0; j < values[i].length; j++)
//			{
//				values[i][j] = num;
//			
//				num++;
//			}
//		}

		int num = 1;
		for(int i = 0; i < values.length; i++) //now wants to control column
		{
			for( int j = 0; j < values[i].length; j++)  //now want j to control row
			{
				values[j][i] = num; //values[rows][columns]
				num++;
			}

		}
		
		//print out the array
		for(int i = 0; i < values.length; i++) //for the rows
		{
			for (int j=0; j < values[i].length; j++) // for the column values for the row
			{
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
