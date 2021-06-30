package sorting6;

import java.util.Scanner;

public class ShellsSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float[] myArray = new float[n];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextFloat();
        }
        for (int i = 0; i < myArray.length - 1; i++) {
            float value = myArray[i];
            if (myArray[i] > myArray[i + 1]) {
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = value;
                i = i - 2;
                if (i < 0) {
                    i = -1;
                }
            }

        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
