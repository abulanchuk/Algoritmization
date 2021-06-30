package sorting1;

import java.util.Scanner;

public class AddSecondArrayToTheFirstArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of 2 arrays");
        int a = in.nextInt();
        int b = in.nextInt();
        int[] array1 = new int[a + b];
        int[] array2 = new int[b];
        System.out.println("enter k");
        int k = in.nextInt();

        for (int i = 0; i < a; i++) {
            array1[i] = 2;
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 9;
        }


        for (int j = a - 1; j >= k + 1; j--) {
            array1[j + b] = array1[j];
        }
        for (int i = 0; i<b; i++) {
            array1[k+1+i] = array2[i];
        }


        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
