package algor2_15;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 != 0) {
            System.out.println("\"Магический квадрат\" \nиз нечетного количества элементов:");
            oddMagicSquare(n);
        } else if (n % 4 == 0) {
            System.out.println("\"Магический квадрат\" \nиз четного количества элементов, кратного 4:");
            evenMatrixSquare(n);
        } else if ((n == 0) || (n == 2) || (n % 4 != 0))
            System.out.println("Для матрицы, с размерностью " + n + " данная программа" +
                    "\nне может составить");
    }

    // кратного 4
    public static void evenMatrixSquare(int n) {
        int[][] matrix = standardMatrixFilling(n);
        int count = 0;
        for (int i = 0; i < matrix.length / 2; i++) {
            int transition;
            if (i < matrix.length / 2) {
                transition = matrix[i][i];
                matrix[i][i] = matrix[matrix.length - 1 - count][matrix.length - 1 - count];
                matrix[matrix.length - 1 - count][matrix.length - 1 - count] = transition;
                count++;
            }
        }
        count = 0;
        for (int i = 0; i < matrix.length / 2; i++) {
            int transition;
            if (i < matrix.length / 2) {
                transition = matrix[matrix.length - 1 - count][i];
                matrix[matrix.length - 1 - count][i] = matrix[i][matrix.length - 1 - count];
                matrix[i][matrix.length - 1 - count] = transition;
                count++;
            }
        }
        printMatrix(matrix);
    }

    //из нечетного колличества элементов
    public static void oddMagicSquare(int n) {
        int[][] matrix = new int[n][n];
        int x = n / 2;
        int y = matrix.length - 1;
        int count = 1;

        while (true) {
            matrix[(matrix.length - 1) - y][x] = count;
            count++;

            if (x == matrix.length - 1) x = -1;
            if (y >= matrix.length - 1) y = -1;
            y++;
            x++;
            if (matrix[matrix.length - 1 - y][x] != 0) y--;

            int count1 = 0;
            for (int[] array : matrix) {
                for (int z : array) {
                    if (z == 0) count1++;
                }
            }
            if (count1 == 0) break;
        }
        printMatrix(matrix);
    }

    public static int[][] standardMatrixFilling(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;

        for (int i = 0; i > matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        return matrix;
    }
    public static void printMatrix(int matrix[][]) {
        for (int[] array : matrix) {
            for (int x : array) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
        System.out.println("");
    }
}
