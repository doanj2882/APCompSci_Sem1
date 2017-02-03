public class Coin extends Money
{
	private double weight;
	
	public Coin()
	{
		super();
		this.weight = 0;
	}
	
	public Coin(String n, double w, double v)
	{
		super(n, v);
		weight = w;
	}
	
	public String scan()
	{
		return weight;
	}
	public String toString()
	{
		return "Weight: " + weight + "g\n" + super.toString();
	}
}