import java.util.Arrays;

public class Toyota14_2 extends TheCar14_2
{

	public Toyota14_2(String l)
	{
		location = new double[2];
		String[] locs =  l.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
	}	

}