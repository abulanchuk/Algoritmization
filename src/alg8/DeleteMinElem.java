package alg8;

import java.util.Scanner;

public class DeleteMinElem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }
        int min = myArray[0];
        int i;
        for (i = 1; i < n; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        int counter = 0;
        for (i = 0; i < n; i++) {
            if (myArray[i] == min)
                counter++;
        }
        for (int z = 0; z < counter; z++) {
            for (i = 0; i < n; i++) {
                if (myArray[i] == min) {
                    break;
                }
            }
            for (int k = i; k < n - 1; k++) {
                myArray[k] = myArray[k + 1];
            }
            n--;
        }
        for (i = 0; i < n; i++) {
            System.out.print(myArray[i] + " ");
            System.out.println("");
        }

    }
}

