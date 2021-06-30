package algor2_12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortRows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        Integer[][] myArray = new Integer[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
                Arrays.sort(myArray[i]);
        }

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j]+" ");
            }
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            Arrays.sort(myArray[i], Collections.reverseOrder());
        }

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j]+" ");
            }
        }
    }
}
