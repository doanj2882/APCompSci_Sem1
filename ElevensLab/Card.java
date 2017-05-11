public class Card {

    private String suit;

    private String rank;

    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) 
	{
        suit = cardSuit;
        rank = cardRank;
        pointValue = cardPointValue;
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

    public boolean matches(Card otherCard) 
	{
        if (suit.equals(otherCard.suit) && rank.equals(otherCard.rank) && pointValue == otherCard.pointValue)
        {
           return true;
        }
        return false;
    }

    @Override
    public String toString() 
    {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
