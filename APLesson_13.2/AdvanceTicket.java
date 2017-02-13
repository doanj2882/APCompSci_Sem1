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
	public int getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}