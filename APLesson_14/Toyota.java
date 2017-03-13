import java.util.Arrays;

public class Toyota extends TheCar
{
	double[] location;

	public Toyota(String l)
	{
		location = new double[2];
		String[] locs =  l.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
	}	

}