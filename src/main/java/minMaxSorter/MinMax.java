package minMaxSorter;

public class MinMax {

    public static void min_max(int t[], int scores[]) {
        scores[0] = scores[1] - t[0];

        for(int i = 1; i < t.length; i++) {
            if(scores[1] < t[i])
                scores[1] = t[i];
            if(scores[0] > t[i])
                scores[0] = t[i];
        }
    }

    /*int scores[] = new int[2];
    int tab[] = {22, 11, -32, 1, 67, 33, 69, 99, 27};

        for(int i = 0; i < tab.length; i++)
            System.out.println("[" + tab[i] +"]\n");
    min_max(tab, scores);
        System.out.println("Min = " +scores[0] + "\nMax = " +scores[1]);*/

    public static void min_max2(int left, int right, int t[], int scores[]) {
        if(left == right)
            scores[0] = scores[1] = t[left]; // one element
        else
            if(left == right-1) //two elements
                if(t[left] < t[right]) {
                    scores[0] = t[left];
                    scores[1] = t[right];
                } else {
                    scores[0] = t[right];
                    scores[1] = t[left];
                }
            else {
                int mid;
                int tempScores[] = new int[2];
                int tempScores2[] = new int[2];

                mid = (left + right) / 2;
                min_max2(left, mid, t, tempScores);
                min_max2(mid+1, right, t, tempScores2);

                if(tempScores[0] < tempScores2[0])
                    scores[0] = tempScores[0];
                else
                    scores[0] = tempScores2[0];
                if(tempScores[1] > tempScores2[1])
                    scores[1] = tempScores[1];
                else
                    scores[1] = tempScores2[1];
            }
    }

    /*int scores[] = new int[2];
    int tab[] = {22, 11, -32, 1, 67, 33, 69, 99, 27};

        for(int i = 0; i < tab.length; i++)
            System.out.println("[" + tab[i] +"]\n");
        min_max2(1, tab.length-1, tab, scores);
        System.out.println("Min = " +scores[0] + "\nMax = " +scores[1]);*/
}
