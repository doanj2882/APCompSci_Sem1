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
        
        String[] ranks = {"Ace", "Two", "..." };
		int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
		Deck d = new Deck(ranks, suits, points);
		System.out.println(d);
		//for()//left off here
    }
}