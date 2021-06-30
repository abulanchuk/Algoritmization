package alg7;

import java.util.Scanner;

public class SumOfFirstAndLastElem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            myArray[i] = in.nextInt();
        }
        long max = myArray[0] + myArray[2 * n - 1];

        for (int i = 1; i <= n - 1; i++) {
            long element = myArray[i] + myArray[2 * n - 1 - i];
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }
}
