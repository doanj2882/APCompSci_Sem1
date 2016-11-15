public class APLab_09_Ex3_AverageNum
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("Number...");
		
		for(int value : numbers)
		{
			System.out.print(value + " ");
		}
		System.out.println();
		System.out.println("The average of the above numbers is..." + average(numbers));
	}
	public static int average(int[] nums)
	{
		int avg = 0;
		for(int num : nums)
		{
			avg+= num;
		}
		return (avg/(nums.length));
	}
}