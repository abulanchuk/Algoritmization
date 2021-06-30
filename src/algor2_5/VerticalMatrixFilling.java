package algor2_5;

import java.util.Scanner;

public class VerticalMatrixFilling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] myArray = new int[size][size];
        if (size % 2 == 1) {
            System.out.println("enter even number");
        } else {
            for (int j = 0; j < size; j++) {
                System.out.println();
                for (int i = 0; i < size - j; i++) {
                    myArray[i][j] = i + 1;
                }
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(myArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
