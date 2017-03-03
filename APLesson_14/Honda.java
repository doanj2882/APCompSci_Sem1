import java.util.Arrays;

public class Honda implements Location
{
	private double[] location;
	public Honda()
	{
		location = new double[2];
	}

	public Honda(double[] loc)
	{
		location = new double[2];
		location[0] = loc[0];
		location[1] = loc[1];
	}	
	
	public int getID()
	{
		return (int)(Math.random()*10000000)+1;
	}

	public void move(double a, double b)
	{
		location[0] += a;
		location[1] += b;
	}

	public double[] getLoc()
	{
		return location;
	}
}