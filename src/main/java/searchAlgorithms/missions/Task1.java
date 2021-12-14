package searchAlgorithms.missions;

//TODO: RETURN SORTED ARRAY FROM THE MIDDLE OF GIVEN ARRAY RANGE ((arL/2) - 2).

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    static int[] array = new int[20];

    public void fillArray(int[] theArray) {
        Random random = new Random();
        for(int i = 0; i < theArray.length; i++) {
            int x = random.nextInt(50);
            theArray[i] = x;
        }
    }

    public void setMiddleArray(int[] theArray, int left, int right) {
        int nums = findDistance(left, right);
        int[] tempArray = new int[nums+1];

        System.out.println("Left point = " + left +
                "\nRight point = " + right +
                "\nDistance = " + nums+ '\n');

            for (int l = left; l <= right; l++) {
                tempArray[l-left] = theArray[l];
            }
        System.out.println("Selected values range: " + Arrays.toString(tempArray));
    }

    private int findDistance(int starPosition, int endPosition) {
        int distance = 0;
        for(int x = starPosition; x < endPosition; x++) {
            distance++;
        }
        return distance;
    }

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.fillArray(array);
        System.out.println("\nThe array: \n" + Arrays.toString(array) + '\n');
        task1.setMiddleArray(array, 2, 11);
    }
}
