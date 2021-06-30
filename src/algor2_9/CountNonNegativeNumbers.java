package algor2_9;

import java.util.Scanner;

public class CountNonNegativeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter rows and columns");
        int rows = in.nextInt();
        int columns = in.nextInt();
        int[][] myArray = new int[rows][columns];
        int[] temp = new int[rows];
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = in.nextInt();
                while (myArray[i][j] < 0) {
                    myArray[i][j] = in.nextInt();
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " ");
            }
        }
        System.out.println();

        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < columns; i++) {
                sum += myArray[i][j];
            }
            temp[j] = sum;
            sum=0;
        }
        int max = temp[0];
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(temp[i]);
            if (temp[i] > max) {
                max = temp[i];
                index =i;
            }

        }
        System.out.println("It's row number: "+index);

    }
}
