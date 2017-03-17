import java.util.ArrayList;
public class Satellite14_2
{
   public static void main(String[]args)
   {
       ArrayList<Location14_2> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda14_2(honLoc));
       locate.add(new Toyota14_2("8, 9"));
       locate.add(new GMC14_2(3, 8));

       double[] home = {0, 0};
	   

       String printout = "\n\n" +
               "==========================";
		for (Location14_2 l : locate)
		{
		   double one =(Math.random()*100)+1;
		   double two =(Math.random()*100)+1;
		   
		   l.move(one, two);
		   printout += "\n\n";
		   printout += "\nAfter " + l.getID() + " Moved : (" + String.format("%.2f, %.2f", one, two) + ")" 
						+ "\nNew Location: (" + (getLocation(l.getLoc())) +")";

		   printout +=
					   "\nDistance from home... "
					   +"\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";

       }
	   System.out.println(printout);
   }


   public static String getDistance(double[] car, double[] home)
   {
       return String.format("%.2f", Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2))));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%.2f, %.2f", loc[0], loc[1]);
   }
}