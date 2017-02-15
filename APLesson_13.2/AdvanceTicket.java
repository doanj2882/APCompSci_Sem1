public class AdvanceTicket extends Ticket
{
	private int daysLeft;
	
	public AdvanceTicket()
	{
		super();
	}
	
	public AdvanceTicket(int d)
	{
		super();
		daysLeft = d;
	}
	public double getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}