import java.util.Arrays;
import java.util.ArrayList;
public class ToyStore
{
	private static ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		
	}
	public ToyStore(String tsl)
	{
		loadToys(tsl);
	}
	public static void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for (int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy nextToy = getThatToy(name);
			if (getThatToy(name) == null)
			{
				if (type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if (type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				nextToy.setCount(nextToy.getCount() + 1);
			}
		}
	}
	public static Toy getThatToy(String nm)
	{
		for (Toy nextToy : toyList)
		{
			if (nextToy.getName().equals(nm))
			{
				return nextToy;
			}
			
		}
				return null;
	}
	public String getMostFrequentToy()
	{
		String name ="";
		int max = Integer.MIN_VALUE;
		for(Toy nextToy : toyList)
		{
			if (max < nextToy.getCount())
			{
				max = nextToy.getCount();
				name = nextToy.getName();
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for (Toy nextToy : toyList)
		{
			if (nextToy.getType().equals("Car"))
			{
				cars += 1;
			}
			if (nextToy.getType().equals("AF"))
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
	public String toString()
	{
		return toyList + "";
	}
}