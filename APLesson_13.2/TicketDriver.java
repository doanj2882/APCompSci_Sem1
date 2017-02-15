public class TicketDriver
{
	public static void main(String[]args)
	{
		AdvanceTicket advance = new AdvanceTicket();
		System.out.println(advance);
		
		StudentAdvanceTicket Sadvance = new StudentAdvanceTicket();
		System.out.println(Sadvance);
		
		Walkup WU= new Walkup();
		System.out.println(WU);
	}
}