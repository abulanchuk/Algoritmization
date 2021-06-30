package sorting7;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        float[] myArray1 = new float[n];
        float[] myArray2 = new float[m];
        float[] myArray3 = new float[n + m];

        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = in.nextFloat();
        }

        for (int j = 0; j < myArray2.length; j++) {
            myArray2[j] = in.nextFloat();
        }
        int position1 = 0;
        int position2 = 0;
        int k = 0;
        while (position1 < n && position2 < m) {
            if (myArray1[position1] < myArray2[position2]) {
                myArray3[k] = myArray1[position1++];
            } else {
                myArray3[k] = myArray2[position2++];
            }

            k++;
        }

        while (position1 < n) {
            myArray3[k++] = myArray1[position1++];
        }
        while (position2 < m) {
            myArray3[k++] = myArray2[position2++];
        }

        for (int i = 0; i < myArray3.length; i++) {
            System.out.print(myArray3[i] + " ");
        }
    }

}