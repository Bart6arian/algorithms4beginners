package searchAlgorithms.bubbleSort;

public class BubbleSearchAlgorithm {

    //the slowest possible algorithm

    static int[] theArray = new int[50];
    static int arraySize = 20;

    public static void swapValues(int indexOne, int indexTwo){
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    //for visualization in array - copied from web
    public static void printHorzArray(int i, int j) {
        int len = theArray.length *2;
        for(int n = 0; n < len; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < arraySize; n++) {
            System.out.print("| " + n + "  ");
        }
        System.out.println("|");
        for(int n = 0; n < len; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < arraySize; n++) {
            System.out.print("| " + theArray[n] + " ");
        }
        System.out.println("|");
        for(int n = 0; n < len; n++)System.out.print("-");
        System.out.println();
        if(j != -1) {
            for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");
            System.out.print(j);
        }
        if(i != -1) {
            for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }


    public void bubbleSearch() {

        for(int i = arraySize -1; i > 1; i--) {
            for(int j =0; j < i; j++) {
                if(theArray[j] > theArray[j+1]) {

                    swapValues(j, j+1);

                    printHorzArray(i, j);
                }
            }
        }
    }
}
