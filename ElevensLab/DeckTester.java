/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) 
    {
        String[] rank1 = {"5", "King", "Ace"};
        String[] suit1 = {"Clubs", "Hearts", "Diamonds"};
        int[] value1 = {5, 13, 14};
        Deck deck1 = new Deck(rank1, suit1, value1);
        System.out.println("Deck1 size: " + deck1.size());
        String[] rank2 = {"6", "King", "Ace"};
        String[] suit2 = {"Clubs", "Hearts", "Diamonds"};
        int[] value2 = {5, 13, 14};
        Deck deck2 = new Deck(rank2, suit2, value2);
        System.out.println("Deck2 empty: " + deck2.isEmpty()); 
        String[] rank3 = {"5", "Queen", "Ace"};
        String[] suit3 = {"Clubs", "Spades", "Diamonds"};
        int[] value3 = {5, 13, 14};
        Deck deck3 = new Deck(rank3, suit3, value3);
        System.out.println("Deck3 deal: " + deck3.deal());

    }
}
