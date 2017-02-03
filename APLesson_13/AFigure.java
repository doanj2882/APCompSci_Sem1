public class AFigure extends Toy
{
	private String AFigure;
	
	public AFigure()
	{
		super();
		this.Afigure = "";
	}
	
	public AFigure(String n, int c)
	{
		super(c);
		this.Afigure = n;
	}
	
	public String getType()
	{
		return AFigure;
	}
	public String toString()
	{
		return AFigure + super.toString;
	}
}