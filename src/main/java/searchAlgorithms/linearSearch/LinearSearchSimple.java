package searchAlgorithms.linearSearch;

public class LinearSearchSimple {

    public static int search(int[] array, int x) {
        int i;
        for(i = 0; (i < array.length) && (array[i] != x); i++);
        return i;
    }

    //example
    /*int[] arr = {1,4,6,7,34,523423,434213,32146,32,1,2,35,11,25};
    int found = search(arr, 32);
        System.out.println("Search for 32... index = " + found);*/

    public static int searchChar(char[] chars, char x) {
        int c;
        for(c = 0; (c < chars.length) && (chars[c] != x); c++);
        return c;
    }

    //example
    /*char[] chars = {'W', 'C', 'O', 'D', 'A', 'D', 'U'};
        System.out.println("Char 'D' on index: " + searchChar(chars, 'D'));*/
}
