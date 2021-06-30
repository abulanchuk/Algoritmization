package sorting5;

import java.util.Scanner;

public class SortByInserts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            int value = myArray[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < myArray[j]) {
                    myArray[j + 1] = myArray[j];
                } else {
                    break;
                }
            }
            myArray[j + 1] = value;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
