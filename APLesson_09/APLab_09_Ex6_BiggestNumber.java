public class APLab_09_Ex6_BiggestNumber
{
	static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray(numbers);
		
		System.out.println("For the following numbers... ");
		printArray(numbers);
		System.out.println();
		System.out.println("The biggest number is " + getBiggest(numbers));
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
	public static int getBiggest(int[] nums)
	{
		int max = 0;
		for(int num : nums)
		{
			if (num>max)
			{
				max = num;
			}
		}
		return max;
	}
}