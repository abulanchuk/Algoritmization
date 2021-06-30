package alg9;

import java.util.Scanner;
import java.util.Arrays;

public class ThePopularElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }
        Arrays.sort(myArray);
        int counter = 1;
        int best_counter = 0;
        int best_number = myArray[0];

        for (int i = 1; i < n; i++) {
            if (myArray[i] == myArray[i - 1]) {
                counter++;
            } else {
                if (counter > best_counter) {
                    best_counter = counter;
                    best_number = myArray[i - 1];
                }
            }
        }
        System.out.println("popular number" + best_number + ", " + best_counter);
    }
}
