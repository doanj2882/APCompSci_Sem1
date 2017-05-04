public class CardTester {
    public static void main(String[] args) {
        Card card1 = new Card("Clubs", "2", 2);
        Card card2 = new Card("Clubs", "2", 2);
        Card card3 = new Card("Diamonds", "King", 13);
        System.out.println(card3.toString());
        System.out.println("card1 & card2: " + card2.matches(card1));
        System.out.println("card2 & card3: " + card2.matches(card3));
	}
	
}
