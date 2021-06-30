package algor2_8;

import java.util.Scanner;

public class SwapСolumns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter rows and columns");

        int rows = in.nextInt();
        int columns = in.nextInt();
        int[][] myArray = new int[rows][columns];
        int[] array = new int[rows];
        int n = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = n++;
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println("what columns u want to swap");
        int column1 = in.nextInt();
        int column2 = in.nextInt();

        for (int i = 0; i < rows; i++) {

            //  array[i] = myArray[i][column1];
            //  myArray[i][column1] = myArray[i][column2];
            //  myArray[i][column2] = array[i];

            int k = 0;
            k = myArray[i][column1];
            myArray[i][column1] = myArray[i][column2];
            myArray[i][column2] = k;
        }
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " ");
            }
        }
    }
}
