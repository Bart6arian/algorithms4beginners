package searchAlgorithms.quickSort;

public class QuickSorter {

    static int[] theArray = new int[50];
    static int arraySize = 20;


    public void quickSort(int arr[], int begin, int end) {
        if(begin < end) {
            int partitionIndex = partition(theArray, begin, end);

            quickSort(theArray, begin, partitionIndex - 1);
            quickSort(theArray, partitionIndex + 1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = theArray[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (theArray[j] <= pivot) {
                i++;

                int swapTemporary = theArray[i];
                theArray[i] = theArray[j];
                theArray[j] = swapTemporary;
            }
        }
        int swapTemporary = theArray[i+1];
        theArray[i+1] = theArray[end];
        theArray[end] = swapTemporary;

        return i+1;
    }
}
