package algor2_2;

import java.util.Scanner;

public class OutputDiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Matrix size is:");
        int size = in.nextInt();;
        int[][] myArray = new int[size][size];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                myArray[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i][i]);
        }
    }
}

