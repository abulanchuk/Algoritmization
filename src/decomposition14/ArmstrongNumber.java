package decomposition14;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int howMany(int a) {
        int count = (a == 0) ? 1 : 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        return count;
    }

    public static boolean armstrongNum(int a, int howMany) {
        double result = 0;
        int b = a;
        boolean goodNumberOrNot = false;
        for (int i = 0; i < howMany; i++) {
            result += Math.pow(a % 10, howMany);
            a = a / 10;
        }
        if (result == b) {
            goodNumberOrNot = true;
        }
        return goodNumberOrNot;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  int number = in.nextInt();
        int k = in.nextInt();

        for (int i = 1; i <= k; i++) {
            int howManyDigits = howMany(i);
            boolean result = armstrongNum(i, howManyDigits);
            if (result) {
                System.out.println(i);
            }
        }
    }
}
