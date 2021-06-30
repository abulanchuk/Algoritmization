package decomposition4;

import java.util.Arrays;
import java.util.Scanner;

public class TheBiggestDistance {

    public static int[] findMaxDistance(int[] x, int[] y, int n) {
        double max = 0;
        int[] value = new int[4];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double k = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                if (k > max) {
                    max = k;
                    value[0] = x[i];
                    value[1] = y[i];
                    value[2] = x[j];
                    value[3] = y[j];
                }


            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter X and Y for" + (i + 1) + " dot");
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        int [] max = findMaxDistance(x, y, n);
        for (int i = 0; i<n;i++){
        System.out.println(max[i]+" ");
    }}
}
