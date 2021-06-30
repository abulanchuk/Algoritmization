package algor2_1;

import java.util.Scanner;

public class OddColumns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();

        int myArray[][] = new int[a][b];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print("Введите элемент myArray[" + i + "][" + j + "]:");

                myArray[i][j] = in.nextInt();
            }
        }

        for (int j = 0; j < myArray.length; j = j + 2) {
            if (myArray[0][j] > myArray[a-1][j]) {
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print(" " + myArray[i][j] + " ");

                }
            }
            System.out.println();
        }


    }
}
