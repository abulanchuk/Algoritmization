package decomposition5;

import java.util.Scanner;

public class MaxElemAfterFirst {

    public static int findThisElement(int[] array, int n) {
        int element = Integer.MIN_VALUE;
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > element){
                if (array[i]==max){
                    continue;
                }
                element = array[i];
            }
        }
        return element;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }
        int secMax = findThisElement(myArray, n);
        System.out.println(secMax);
    }
}
