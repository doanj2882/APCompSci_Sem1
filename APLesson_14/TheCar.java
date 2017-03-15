public class TheCar implements Location
{
	public double[] location;
	private final int ID = (int)(Math.random()*10000000)+1;
	
	public TheCar()
	{
		location = new double[2];
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
	public void move(double a, double b)
	{
		location[0] += a;
		location[1] += b;
	}
}