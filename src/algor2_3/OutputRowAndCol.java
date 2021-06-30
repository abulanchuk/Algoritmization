package algor2_3;

import java.util.Scanner;

public class OutputRowAndCol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter matrix's size n:m");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] myArray = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                myArray[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + myArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("what row u want to output");
        int k = in.nextInt();
        System.out.println("what column u want to output");
        int p = in.nextInt();

        if (k >= n || p >= m) {
            System.out.println("enter correct number");
            return;
        }

        for (int j = 0; j < m; j++) {
            System.out.print(" " + myArray[k][j]);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(" " + myArray[i][p]);
        }
    }
}
