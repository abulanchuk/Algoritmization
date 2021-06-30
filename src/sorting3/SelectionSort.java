package sorting3;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            int max = myArray[i];
            int idxMax = i;

            for (int j = i + 1; j < n; j++) {
                if (myArray[j]> max) {
                    max = myArray[j];
                    idxMax = j;
                }
            }
            myArray[idxMax] = myArray[i];
            myArray[i] = max;
            /*for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] > max) {
                    max = myArray[j];
                    myArray[j] = myArray[i];
                }
                myArray[i] = max;
            }*/

        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
