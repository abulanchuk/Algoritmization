package decomposition8;

import java.util.Scanner;

public class SumOfThreeElements {

    public static int findSum(int array[], int k) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i==k || i==k+1 || i==k+2){
                sum += array[k];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D[] = new int[6];

        for (int i = 0; i < D.length; i++) {
            D[i] = in.nextInt();
        }
        System.out.println("enter k");
        int k = in.nextInt();
        int sum = findSum(D, k);
        System.out.println("sum of elements: "+sum);
    }
}
