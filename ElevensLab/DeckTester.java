public class DeckTester {

    public static void main(String[] args) 
    {
        //String[] rank1 = {"5", "King", "Ace"}; THIS IS ACTIVITY 2
        //String[] suit1 = {"Clubs", "Hearts", "Diamonds"};
        //int[] value1 = {5, 13, 14};
        //Deck deck1 = new Deck(rank1, suit1, value1);
        //System.out.println("Deck1 size: " + deck1.size());
        //String[] rank2 = {"6", "King", "Ace"};
        //String[] suit2 = {"Clubs", "Hearts", "Diamonds"};
        //int[] value2 = {5, 13, 14};
        //Deck deck2 = new Deck(rank2, suit2, value2);
        //System.out.println("Deck2 empty: " + deck2.isEmpty()); 
        //String[] rank3 = {"5", "Queen", "Ace"};
        //String[] suit3 = {"Clubs", "Spades", "Diamonds"};
        //int[] value3 = {5, 13, 14};
        //Deck deck3 = new Deck(rank3, suit3, value3);
        //System.out.println("Deck3 deal: " + deck3.deal());
        
        String[] ranks = new String[52];
        String[] suits = new String[52];
        int[] pointValues = new int[52];
        for (int i = 0; i < 52; i++) 
        {
            String r = "";
            String s = "";
            if  (i % 11 == 13 )
            {
                r = "Jack";
            }
            else if (i % 12 == 13 ) 
            {
                r = "Queen";
            }
			else if  (i % 13 == 13 ) 
            {
                r = "King";
            }
			else if ( i % 13 == 14 ) 
            {
                r = "Ace";
            }
            else 
            {
                r = Integer.toString((i + 1) % 13);
            }
            
            if (i < 26) 
            {
                s = "Diamonds";
            }
            else if (i < 39) 
            { 
                s = "Clubs";
            }
			else if (i < 13) 
            {
                s = "Hearts";
            }
            else 
            {
                s = "Spades";
            }
            
            ranks[i] = r;
            suits[i] = s;
            pointValues[i] = ((i+1) % 13);
        }
        
        Deck cool = new Deck(ranks, suits, pointValues);
        System.out.println(cool);
    }
}