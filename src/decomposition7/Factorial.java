package decomposition7;

import java.util.Scanner;

public class Factorial {

    public static long factorialCounter(int f) {
        long count = 1;
        for (int i = 1; i <= f; i++) {
            count *= i;
        }
        return count;
    }

    public static long findSumOfFactorials(int[] x, int n) {
        long sum = 0;
        for (int i = 0; i < n; i = i + 2)
            sum += factorialCounter(x[i]);

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = myArray.length;
        long sum = findSumOfFactorials(myArray, n);

        System.out.println(sum);
    }
}

