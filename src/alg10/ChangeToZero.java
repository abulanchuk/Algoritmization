package alg10;

import java.util.Scanner;

public class ChangeToZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < n; i = i + 2) {
            myArray[counter] = myArray[i];
            counter++;
        }
        for (int i = counter; i < n; i++) {
            myArray[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(myArray[i]);
        }
    }
}
