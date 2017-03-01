import java.util.Arrays;

public class GMC implements Location
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
	
	public int getID()
	{
		return (int)(Math.random()*10000000)+1;
	}

	public void move(double a, double b)
	{
		this.x += a;
		this.y += b;
	}

	public double[] getLoc()
	{
		double[] Loc = {x, y};
		return Loc;
	}
}