public class Shuffler {

    private static final int SHUFFLE_COUNT = 1;
    private static final int VALUE_COUNT = 10;

    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void perfectShuffle(int[] values) 
    {
        int[] shuffled = new int[values.length];
		int mid = values.length/2;
		int i = 0;
		int j = 0;
		//takes first half and puts in shuffled even
		for (; i < mid; i++)//for loop from 0 to mid iterate by 1
			values[i] = shuffled[j];//put values @ i in shuffled @ j
			//iterate j by 2
		//reset j = 1
		
		//takes second half and puts in shuffled odd
		for(; i < values.length; i++)//for loop i from mid to length
			//put values @ i in shuffled @ j
			//iterate j by 2
		
		//for loop
			//put values from shuffled into values
	}
}

    public static void selectionShuffle(int[] values) 
    {
        for( int i = VALUE_COUNT - 1; i >= 0; i-- ) 
        {
            int j = (int)(Math.random() * i); //just pick a random index
            int comp = values[j]; //swap integer (just a placeholder)
            values[j] = values[i];
            values[i] = comp;
        }
    }
}
