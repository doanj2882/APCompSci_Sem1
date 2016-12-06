public class APLesson_11_Searching2DArrays
{
	public static void main(String[]args)
	{
		int[][] values = new int [4][4];
		
		int num = 1;
		for(int i = 0; i < values.length; i++) //now wants to control column
		{
			for( int j = 0; j < values[i].length; j++)  //now want j to control row
			{
				values[j][i] = num; //values[rows][columns]
				num++;
			}

		}
		
		for(int i = 0; i < values.length; i++) //for the rows
		{
			for (int j=0; j < values[i].length; j++) // for the column values for the row
			{
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
		
		//search the array
		int count = 0;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				if(values[i][j] % 5 == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " multiples of 5 in the Array. ");
	}
}
