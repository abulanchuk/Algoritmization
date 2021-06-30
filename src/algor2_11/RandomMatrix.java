package algor2_11;

import java.util.Scanner;

public class RandomMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = 10;
        int columns = 20;
        int[][] myArray = new int[rows][columns];
        int counter = 0;
        int[] whatRows = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = (int) (Math.random() * 15);
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " ");
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (myArray[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                int k = 0;
                whatRows[k] = i;
                k++;
                System.out.println(i);
            }
            counter = 0;

        }
    }
}
