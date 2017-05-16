public class Card {

    private String suit;

    private String rank;

    private int pointValue;

    public Card(String r, String s, int pv) 
	{
        suit = s;
        rank = r;
        pointValue = pv;
    }

    public String suit()
    {
        return suit;
    }

    public String rank() 
    {
       return rank;
    }

    public int pointValue() 
    {
        return pointValue;
    }

    public boolean equality(Card pair) 
	{
        if (suit.equals(pair.suit) && rank.equals(pair.rank) && pointValue == pair.pointValue)
        {
           return true;
        }
        return false;
    }

    public String toString() 
    {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
