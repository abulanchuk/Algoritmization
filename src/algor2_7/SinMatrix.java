package algor2_7;

import java.util.Scanner;

public class SinMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        double[][] myArray = new double[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                myArray[i][j] = Math.sin((double) ((i * i) - (j * j)) / n);
                if (myArray[i][j]>0){
                    counter++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("How many positive numbers: "+counter);
    }
}
