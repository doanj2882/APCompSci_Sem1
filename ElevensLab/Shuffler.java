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
        int[] split1 = new int[VALUE_COUNT/2];
        int[] split2 = new int[VALUE_COUNT-VALUE_COUNT/2];

        for(int i=0; i<VALUE_COUNT/2; i++) 
        {
            split1[i] = values[i];
        }
        
        for(int i=0; i<VALUE_COUNT-VALUE_COUNT/2; i++) 
        {
            split2[i] = values[ i + VALUE_COUNT / 2 ];
        }

        for(int i=0; i<VALUE_COUNT/2; i++) 
        {
            values[2*i] = split2[i];
            values[2*i+1] = split1[i];
        }

        if(VALUE_COUNT%2!= 0) 
        {
            values[VALUE_COUNT - 1] = split2[VALUE_COUNT- (VALUE_COUNT/2)];
        }
}

    public static void selectionShuffle(int[] values) 
    {
        for( int i = VALUE_COUNT - 1; i >= 0; i-- ) 
        {
            int j = (int)(Math.random() * i);
            
            int comp = values[j];
            values[j] = values[i];
            values[i] = comp;
        }
    }
}
