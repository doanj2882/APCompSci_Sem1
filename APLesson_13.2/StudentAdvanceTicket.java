public class StudentAdvanceTicket extends AdvanceTicket
{

	public StudentAdvanceTicket()
	{
		super();
	}
	public StudentAdvanceTicket(int d)
	{
		super(d);
	}
	public int getPrice()
	{
		return (super.getPrice()/2);
	}
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\n" +
				"Price: " + getPrice()+ "\n" +
				"(Student ID Required)";
	}
}