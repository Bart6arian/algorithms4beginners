package searchAlgorithms.binarySearch;

import static searchAlgorithms.bubbleSort.BubbleSearchAlgorithm.printHorzArray;

public class BinarySearcher {

    static int[] theArray = new int[50];
    static int arraySize = 20;

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

    public void binarySearchVal(int value){

        int lowIndex = 0;
        int highIndex = arraySize - 1;
        while(lowIndex <= highIndex){
            int middleIndex = (highIndex + lowIndex) / 2;
            if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
                else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;
                else {
                System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
                lowIndex = highIndex + 1;
            }
            printHorzArray(middleIndex, -1);
        }
    }

}
