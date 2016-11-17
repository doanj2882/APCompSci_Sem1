public class APLab_09_Ex5_GetOdds
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];

		fillArray(numbers);
		
		System.out.println("For the following numbers... ");
		printArray(numbers);
		System.out.println();
		System.out.println("The " + getOdds(numbers) + " are odd numbers");
	}
	public static void fillArray(int[] nums)
	{
		for(int i = 0; i < nums.length; i++)
		{
			nums[i]=(int)(Math.random() * 100) + 1; 
		}

	}
	public static void printArray(int[] nums)
	{
		for(int num : nums)
		{
			System.out.print(num + " ");
		}
	}
	public static String getOdds(int[] nums)
	{
		String odds = "";
		for(int num : nums)
		{
			if (num%2 != 0)
			{
				odds+= (num + " ");
			}
		}
		return odds;
	}
}