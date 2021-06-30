package decomposition16;

import java.util.Scanner;

public class FindOddNumbers {

    public static boolean evenOrOddNumber(int number, int n) {
        boolean resultEven = false;

        for (int i = n - 1; i >= 0; i--) {
            if ((number % 10) % 2 == 0) {
                resultEven = true;
            }

        }
        return resultEven;
    }


    public static int sumOfEvenElem(int sum) {
        int result = 0;
        while (sum > 0) {
            if ((sum % 10)%2 == 0) {
                result += sum % 10;
            }
            sum /= 10;
        }
        return result;
    }

    public static long whereArrayStartAndFinish(int numberOfTen) {

        int start = (int) (Math.pow(10, numberOfTen - 1));
        int finish = (int) (Math.pow(10, numberOfTen)) - 1;
        long sum = 0;

        for (int i = start; i <= finish; i++) {
            boolean res = evenOrOddNumber(i, numberOfTen);
            if (!res) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = whereArrayStartAndFinish(n);
        System.out.println(sum);

        int sumOfEvenElements = sumOfEvenElem((int) sum);
        System.out.println(sumOfEvenElements);
    }

}
