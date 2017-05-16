public class DeckTester {

    public static void main(String[] args) 
    {
        //String[] r1 = {"5", "King", "Ace"}; THIS IS ACTIVITY 2
        //String[] s1 = {"Clubs", "Hearts", "Diamonds"};
        //int[] v1 = {5, 13, 14};
        //Deck d1 = new Deck(r1, s1, v1);
        //System.out.println("D1 size: " + d1.size());
        //String[] r2 = {"6", "King", "Ace"};
        //String[] s2 = {"Clubs", "Hearts", "Diamonds"};
        //int[] v2 = {5, 13, 14};
        //Deck d2 = new Deck(r2, s2, v2);
        //System.out.println("D2 empty: " + d2.isEmpty()); 
        //String[] r3 = {"5", "Queen", "Ace"};
        //String[] s3 = {"Clubs", "Spades", "Diamonds"};
        //int[] v3 = {5, 13, 14};
        //Deck d3 = new Deck(rank3, suit3, value3);
        //System.out.println("D3 deal: " + d3.deal());
        
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