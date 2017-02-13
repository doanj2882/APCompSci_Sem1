public abstract class Ticket
{
	private int serialNo, price;
	
	public Ticket()
	{
		this.serialNo = 0;
		this.price = 0;
	}
	public int getSerialNo()
	{
		return (int)(Math.random()*10000000)+1;
	}
	public abstract int getPrice();

	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\n" +
				"Price: " + getPrice();
	}
}