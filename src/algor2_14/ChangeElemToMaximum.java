package algor2_14;

import java.util.Scanner;

public class ChangeElemToMaximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int myArray[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = in.nextInt();
            }
        }
        int max = myArray[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (myArray[i][j] > max) {
                    max = myArray[i][j];
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (myArray[i][j] < 0) {
                    myArray[i][j] = max;
                }
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
