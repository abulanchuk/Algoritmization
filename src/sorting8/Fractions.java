package sorting8;
import java.util.Arrays;
import java.util.Scanner;

class GCD {
    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}

public class Fractions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nFractions = in.nextInt();
        System.out.println("enter " + nFractions + " numerators");

        int[] arrayWithNumerators = new int[nFractions];
        int[] arrayWithDenominators = new int[nFractions];

        for (int i = 0; i < arrayWithNumerators.length; i++) {
            arrayWithNumerators[i] = in.nextInt();
        }
        for (int j = 0; j < arrayWithDenominators.length; j++) {
            arrayWithDenominators[j] = in.nextInt();
        }
        GCD gcd = new GCD();
        // 2 4 10 14
        // 4 10 14
        // 20 14

        long lcm = arrayWithDenominators[0];
        for (int i = 1; i < nFractions; i++) {
            lcm = gcd.lcm(lcm, arrayWithDenominators[i]);
        }
        System.out.println("LCM: " + lcm);

        long[] numerators = new long[nFractions];
        for (int i = 0; i < numerators.length; i++) {
            numerators[i] = (arrayWithNumerators[i] * (lcm / arrayWithDenominators[i]));
        }

        Arrays.sort(numerators);
        for (int i = 0; i < numerators.length; i++) {
            System.out.print(numerators[i]+"/" +lcm +" ");
        }
    }
}
