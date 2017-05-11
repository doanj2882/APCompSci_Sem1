import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;

    public Deck(String[] ranks, String[] suits, int[] values) 
    {
        this.cards = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++) 
        {
            Card rand = new Card(ranks[i], suits[i], values[i]);
            cards.add(rand);
        }
        size = cards.size();
        shuffle();
    }

    public boolean isEmpty() 
    {
        if (cards.size() == 0) 
        {
            return true;
        }
        return false;
    }

    public int size() 
    {
        return cards.size();
    }

    public void shuffle() 
    {
      for( int i = size - 1; i >= 0; i-- ) 
      {
            int j = (int)(Math.random() * i);
            
            Card rand = cards.get(j);
            cards.set(j, cards.get(i));
            cards.set(i, rand);
      }
    }

   public Card deal() 
   {
        size = size - 1;
        if (size > 0) 
        {
            return cards.get(size);
        }
        return null;
    }

    @Override
    public String toString() 
	{
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) 
		{
            rtn = rtn + cards.get(k);
            if (k != 0) 
			{
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) 
			{
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) 
		{
            rtn = rtn + cards.get(k);
            if (k != size) 
			{
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) 
			{
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
