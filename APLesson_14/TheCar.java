public class TheCar implements Location
{
	private double[] location;
	private int ID;
	
	public TheCar()
	{
		location = new double[2];
		ID = 0;
	}
	
	public int getID()
	{
		ID = (int)(Math.random()*10000000)+1;
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