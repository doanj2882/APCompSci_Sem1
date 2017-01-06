
public class APLesson_12
{
	//instance variables
	private String userName, firstName, lastName;
	
	//default constuctor
	public APLesson_12()
	{
		userName = "";
		firstName = "";
		lastName= "";
	}
	
	//Constructor with parameters
	public APLesson_12(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	//Modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public static void main (String[]args)
	{
		APLesson_12 object = new APLesson_12("jaredoan", "Jared", "Doan");
		
		System.out.println("<<<<<<<<<<<<<<<User Info>>>>>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("Username: " + object.getUserName());
	}
}