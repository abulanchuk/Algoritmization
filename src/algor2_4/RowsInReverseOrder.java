package algor2_4;

import java.util.Scanner;

public class RowsInReverseOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] myArray = new int[size][size];
        int s = 1;
        int k =size;
        if (size%2==1){
            System.out.println("enter even number");
        }
        else {
            for (int i = 0; i < size; i++) {
                System.out.println();
                if (i % 2 == 0 || i == 0) {
                    for (int j = size - 1; j >= 0; j--) {
                        myArray[i][j] = k--;
                        System.out.print(myArray[i][j]);
                        System.out.print(" ");
                    }
                    k = size;
                } else {
                    for (int j = 0; j < size; j++) {
                        myArray[i][j] = s++;
                        System.out.print(myArray[i][j]);
                        System.out.print(" ");
                    }
                    s = 1;
                }
            }
        }
    }
}
