import java.util.Arrays;

public class Toyota implements Location
{
	private double[] location;

	public Toyota()
	{
		double[] location = new double[2];
	}

	public Toyota(String loc)
	{
		double[] location = new double[2];
		String[] coordinates = new String[2];
		double x = String.parseString(coordinates.substring(coordinates.indexOf(", ")));
		double y = String.parseString(coordinates.substring(coordinates.indexOf(", ")+2));
		String[] coordinates = {x, y};
	}	
	
	public int getID()
	{
		return (int)(Math.random()*10000000)+1;
	}

	public void move(double a, double b)
	{
		x += a;
		y += b;
	}

	public double[] getLoc()
	{
		return location;
	}
}