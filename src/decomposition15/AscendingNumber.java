package decomposition15;

import java.util.Scanner;

public class AscendingNumber {

    public static boolean numbersAscendingOrNot(int number, int numberOfTen) {
        int[] array = new int[numberOfTen];
        for (int i = numberOfTen - 1; i >= 0; i--) {
            array[i] = number % 10;
            number = number / 10;
        }

        for (int i = 0; i < numberOfTen - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }

        }
        return true;
    }

    public static int[] whereStartAndFinish(int numberOfTen) {
        boolean count = false;

        int start = (int) (Math.pow(10, numberOfTen - 1));
        int finish = (int) (Math.pow(10, numberOfTen)) - 1;
        int[] ArrayWithIncreasingNumbers = new int[finish - start];
        int j = 0;

        for (int i = start; i <= finish; i++) {
            boolean increasingNumber = numbersAscendingOrNot(i, numberOfTen);
            if (increasingNumber) {
                ArrayWithIncreasingNumbers[j++] = i;
            }
        }
        return ArrayWithIncreasingNumbers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] result = whereStartAndFinish(n);

        int i = 0;
        while (result[i] != 0) {
            System.out.println(result[i++]);
        }
    }

}
