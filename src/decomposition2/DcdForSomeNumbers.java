package decomposition2;

import java.util.Scanner;

public class DcdForSomeNumbers {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 4;
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }

        int gcd = myArray[0];
        for (int i = 1; i < n; i++) {
            gcd = gcd (gcd, myArray[i]);
        }
        System.out.println("GCD: " + gcd);
    }
}
