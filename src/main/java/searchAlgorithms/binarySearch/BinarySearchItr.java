package searchAlgorithms.binarySearch;

public class BinarySearchItr {

    public static int searchBinaryItr(int arr[], int x) {
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        boolean found = false;

        while((left <= right) && (!found)) {
            mid = (left + right) /2;

            if(arr[mid] == x)
                found = true;

            else
                if(arr[mid] < x)
                    left = mid +1;

                else
                    right = mid -1;
        }
        if(found == true)
            return mid;
        else
            return -1;
    }
}
