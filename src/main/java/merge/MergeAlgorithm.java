package merge;

public class MergeAlgorithm {

    public void merge(int T[], int left, int mid, int right) {
        int left1 = left, right1 = mid; //subarray1
        int left2 = mid+1, right2 = right; // subarray2;
        int T2[] = new int[T.length]; //T2 - support array;
        int i = left1;

        while((left1 <= right1) && (left2 <= right2)) {
            if(T[left1] < T2[left2]) {
                T2[i] = T[left1];
                left1++;
            } else {
                T2[i] = T[left2];
                left2++;
            }
            i++;
        }
        while(left1 <= right1) {
            T2[i] = T[left1];
            left1++;
            i++;
        }
        while(left2 <= right2) {
            T2[i] = T[left2];
            left2++;
            i++;
        }
        for(i = left; i <= right; i++) //copy from origin to temp;
            T[i] = T2[i];
    }

    public void mergeSorter(int T[], int left, int right) {
        if(left < right) {
            int mid = (left + right) /2;
            mergeSorter(T, left, mid);
            mergeSorter(T, mid+1, right);
            merge(T, left, mid, right);
        }
    }
}
