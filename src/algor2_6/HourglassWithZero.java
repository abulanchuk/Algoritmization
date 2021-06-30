package algor2_6;

import java.util.Scanner;

public class HourglassWithZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] myArray = new int[size][size];
        int k = 1;
        if (size % 2 == 1) {
            System.out.println("enter even number");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println();
                if (size / 2 > i) {
                    for (int j = i; j < size - i; j++) {
                        myArray[i][j] = k;

                    }
                } else {
                    for (int j = size - i-1; j <= i; j++) {
                        myArray[i][j] = k;
                    }
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
