import java.util.List;
import java.util.ArrayList;

public class Deck {

    private List<Card> cards;

    private int size;

    public Deck(String[] r, String[] s, int[] v) 
    {
        cards = new ArrayList<Card>();
        for (int i = 0; i < r.length; i++) 
        {
            Card rand = new Card(r[i], s[i], v[i]);
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
            
            Card cut = cards.get(j);
            cards.set(j, cards.get(i));
            cards.set(i, cut);
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
