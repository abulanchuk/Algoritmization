package decomposition10;

import java.util.Scanner;

public class ParsingANumberIntoDigits {

    public static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] createArray(int number, int n) {
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = number % 10;
            number = number / 10;
        }


        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = getCountsOfDigits(n);
        int[] myArray = new int[counter];
        int[] result = createArray(n, counter);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
