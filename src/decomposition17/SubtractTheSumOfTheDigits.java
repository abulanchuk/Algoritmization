package decomposition17;

import java.util.Scanner;

public class SubtractTheSumOfTheDigits {

    public static int findQuantityOfDigits(int a) {
        int count = (a == 0) ? 1 : 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        return count;
    }

    public static int findTheSumOfTheDigitsAndSubtract(int number, int numberOfTen) {
        int sumOfDigits = 0;

        int savedNubmer = number;
        int[] array = new int[numberOfTen];
        for (int i = numberOfTen - 1; i >= 0; i--) {
            array[i] = number % 10;
            number = number / 10;
            sumOfDigits += array[i];
        }

        int res = savedNubmer - sumOfDigits;
        return res;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int quantity =0;
        int k = 0;
        int result = number;
        quantity = findQuantityOfDigits(number);
        while (result != 0) {

             result = findTheSumOfTheDigitsAndSubtract(result, quantity);
            quantity = findQuantityOfDigits(result);
            k++;
        }
        System.out.println(k);
    }
}
