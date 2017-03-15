import java.util.Arrays;

public class GMC extends TheCar
{
	private double x, y;

	public GMC()
	{
		x = 0;
		y = 0;
	}

	public GMC(double X, double Y)
	{
		x = X;
		y = Y;
	}	
	public double[] getLoc ()
	{
		location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
}