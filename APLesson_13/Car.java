public class Car extends Toy
{
	private String Car;
	
	public Car()
	{
		super();
		this.Car = "";
	}
	
	public Car(String n, int c)
	{
		super(c);
		this.Car = n;
	}
	
	public String getType()
	{
		return Car;
	}
	public String toString()
	{
		return Car + super.toString;
	}
}