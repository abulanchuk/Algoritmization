package sorting2;

import java.util.Scanner;

public class MakeASequenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] firstArray = new int[n + m];
        int[] secondArray = new int[m];

        for (int i = 0; i < firstArray.length - secondArray.length; i++) {
            firstArray[i] = in.nextInt();
        }
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = in.nextInt();
        }

        for (int i = 0; i < secondArray.length; ++i) {
            firstArray[n + i] = secondArray[i];
        }

        for (int i = 0; i < firstArray.length - 1; i++) {
            for (int j = firstArray.length - 1; j > i; j--) {
                if (firstArray[j - 1] > firstArray[j]) {
                    int tmp = firstArray[j - 1];
                    firstArray[j - 1] = firstArray[j];
                    firstArray[j] = tmp;
                }
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
    }
}
