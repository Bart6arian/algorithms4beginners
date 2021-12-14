package searchAlgorithms.quickSort;


public class Partitioning {
    private static int[] theArray = new int[50];
    private static int arraySize;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 30;
        }
    }

    public Partitioning(int newArraySize) {
        arraySize = newArraySize;
        theArray = new int[arraySize];
        generateRandomArray();
    }

    public void partitionArray(int pivot) {
        int leftPointer = -1;
        int rightPointer = arraySize;

        while (true) {
            while (leftPointer < (arraySize - 1) && theArray[++leftPointer] < pivot) ; // increment first the value

            printHorzArray(leftPointer, rightPointer);

            System.out.println(theArray[leftPointer] + " in index " + leftPointer
                    + " is bigger then the pivot val. Pivot[ " + pivot + " ]");

            while (rightPointer > 0 && theArray[--rightPointer] > pivot);

            printHorzArray(leftPointer, rightPointer);

            System.out.println(theArray[rightPointer] + " in index " + rightPointer
                    + " is smaller then the pivot val. Pivot[ " + pivot + " ]");

            printHorzArray(leftPointer, rightPointer);

            if (leftPointer >= rightPointer) break;

            else {
                swapValues(leftPointer, rightPointer);

                System.out.println(theArray[leftPointer] + " was swapped for "
                        + theArray[rightPointer]);
            }
        }
    }

    public static void swapValues(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    //for visualization in array - copied from web
    static void printHorzArray(int i, int j) {
        for (int n = 0; n < 61; n++)
        System.out.print("-");
        System.out.println();
        for (int n = 0; n < arraySize; n++) {
            System.out.format("| %2s " + " ", n);
        }
        System.out.println("|");
        for (int n = 0; n < 61; n++)
        System.out.print("-");
        System.out.println();
        for (int n = 0; n < arraySize; n++) {

            System.out.print(String.format("| %2s " + " ", theArray[n]));
        }
        System.out.println("|");
        for (int n = 0; n < 61; n++)
        System.out.print("-");
        System.out.println();
        if (i != -1) {
            int spacesBeforeFront = 5 * i + 1;
            for (int k = 0; k < spacesBeforeFront; k++)
            System.out.print(" ");
            System.out.print("L");
            int spacesBeforeRear = (5 * j + 1 - 1) - spacesBeforeFront;
            for (int l = 0; l < spacesBeforeRear; l++)
            System.out.print(" ");
            System.out.print("H");
            System.out.println("\n");
        }
    }

}
