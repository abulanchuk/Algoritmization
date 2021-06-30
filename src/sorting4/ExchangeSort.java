package sorting4;

import java.util.Scanner;

public class ExchangeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];
        int cointer = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < myArray.length - 1; i++) {
                int temporaryVariable = 0;
                if (myArray[i + 1] < myArray[i]) {
                    temporaryVariable = myArray[i + 1];
                    myArray[i + 1] = myArray[i];
                    myArray[i] = temporaryVariable;
                    cointer++;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("how many " + cointer);
    }
}
