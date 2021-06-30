package decomposition6;

import java.util.Scanner;

public class CoprimeNumbers {

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
        int n = 3;
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = in.nextInt();
        }

        int compare1 = gcd(myArray[0], myArray[1]);
        int compare2 = gcd(myArray[1], myArray[2]);
        int compare3 = gcd(myArray[0], myArray[2]);
        boolean result = false;
        if (compare1 ==1 && compare2 ==1 && compare3==1){
            result = true;
        }
        System.out.println(result);
    }
}
