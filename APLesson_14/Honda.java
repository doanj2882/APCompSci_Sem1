import java.util.Arrays;

public class Honda extends TheCar
{
	private double[] location;

	public Honda(double[] loc)
	{
		location = new double[2];
		location[0] = loc[0];
		location[1] = loc[1];
	}	
}