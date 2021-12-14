package recursion.beginner;

public class NumFinder {

    public static void find(int tab[], int left, int right, int x) {
        if(left > right) {
            System.out.println("Element " +x+ " not found");
        } else {
            if (tab[left] == x) {
                System.out.println("Element " +x+" found");
            } else {
                find(tab, left+1, right, x);
            }
        }
    }

    //Recursion begin
        /*int tab[] = {1, 2, 3, 4, 6, -8, 51, -2, 0, 32};
        for(int i =0; i < tab.length; i++)
            System.out.println("t["+i+"] = "+ tab[i]+"");

        System.out.println();

        find(tab, 3, tab.length-1, 8);
        find(tab, 5, tab.length-2, 0);
    }*/
}
