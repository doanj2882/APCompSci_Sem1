public class Inventory
{
	private String manu, name, cat;
	private int UPC, price;
	
	public Inventory(String m, String n)
	{
		manu = m;
		name = n;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	public Inventory(String m, String n, String c, int p)
	{
		manu = m;
		name = n;
		cat = c;
		price = p;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	public void setInventory(String m, String n, String c, int p)
	{
		manu = m;
		name = n;
		cat = c;
		price = p;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	public String m()
	{
		return manu;
	}
	public String n()
	{
		return name;
	}
	public String c()
	{
		return cat;
	}
	public int p()
	{
		return price;
	}
	public String toString()
{
   return "Inventory Info...\nManufacturer: " + manu +
                           "\nName: " + name +
                           "\nCategory: " + cat +
                           "\nUPC: " + UPC +
						   "\nPrice: " +price;
}
}