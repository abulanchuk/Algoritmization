package algor2_10;

import java.util.Scanner;

public class FindPositiveElementsOnDiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] myArray = new int[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                myArray[i][j] = in.nextInt();

            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(myArray[i][j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (myArray[i][i] > 0) {
                System.out.println(myArray[i][i]);
            }
        }
    }
}
