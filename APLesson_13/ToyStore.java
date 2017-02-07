import java.util.Scanner;

public class ToyStore
{
	private ArrayList<ToyList> inventory;
	
	public ToyStore()
	{
		inventory = ArrayList<>();
	}
	public ToyStore(tsl)
	{
		loadToys(tsl);
	}
	public static void LoadToys(String ts)
	{
		toys = ArrayList<String>(ts.split(", "));
		
		for (int i = 0, i <= toys.length(), i++)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			toy = new ArrayList<String>(getThatToy(name));
			if (toy.equals("null")
			{
				if (type.equals("Car"))
				{
					return Car
				}
				if (type.equals("AF"))
				{
					return AFigure
				}
			}
			else
			{
				count += 1
			}
		}
	}
	public static String getThatToy(nm)
	{
		for (toy )
		{
			if (toy==nm)
			{
				return toy;
			}
			else
			{
				return "null";
			}
		}
	}
	public getMostFrequentToy()
	{
		static String name;
		int max = Integer.MIN_VALUE
		for(toy )
		{
			if (max < count)
			{
				max = count;
				name = toy.get();
			}
		}
		return name;
	}
	public getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for (toy )
		{
			if (type.equals("Car"))
			{
				cars += 1;
			}
			if (type.equals("AF"))
			{
				figures += 1;
			}
		}
		if (cars > figures)
		{
			return "Cars";
		}
		if (figures > cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
}