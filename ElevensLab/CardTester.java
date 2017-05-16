public class CardTester 
{
    public static void main(String[] args) 
	{
        Card c1 = new Card("Clubs", "2", 2);
        Card c2 = new Card("Clubs", "2", 2);
        Card c3 = new Card("Diamonds", "King", 13);
        System.out.println(c3.toString());
        System.out.println("c1 & c2: " + c2.matches(c1));
        System.out.println("c2 & c3: " + c2.matches(c3));
	}
	
}
