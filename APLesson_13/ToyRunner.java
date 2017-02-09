public class ToyRunner
{
	public static void main(String[]args)
	{
		ToyStore newToy = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(newToy);
		System.out.println(newToy.getMostFrequentToy());
		System.out.println(newToy.getMostFrequentType());
	}
}