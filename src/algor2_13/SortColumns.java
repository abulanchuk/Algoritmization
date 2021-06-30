package algor2_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortColumns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        Integer[][] myArray = new Integer[rows][columns];
        Integer[] newArray = new Integer[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = in.nextInt();
            }
        }
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                newArray[i] = myArray[i][j];
            }
            Arrays.sort(newArray);
            for (int i = 0; i < rows; i++) {
                myArray[i][j] = newArray[i];
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " ");
            }
        }
        System.out.println();

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                newArray[i] = myArray[i][j];
            }
            Arrays.sort(newArray, Collections.reverseOrder());
            for (int i = 0; i < rows; i++) {
                myArray[i][j] = newArray[i];
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " ");
            }
        }
    }
}
