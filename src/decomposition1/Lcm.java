package decomposition1;

import java.util.Scanner;

public class Lcm {
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

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
        int gsd = 0;
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
