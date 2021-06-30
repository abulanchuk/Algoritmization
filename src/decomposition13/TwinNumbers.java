package decomposition13;

import java.util.Scanner;

public class TwinNumbers {
    public static boolean isSimpleNumber(int a) {
        boolean flag = false;
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n < 2) {
            System.out.println("enter the number more than 2");
            n = in.nextInt();
        }
        int number1 = 0;
        int number2 = 0;
        int simple1[] = new int[n];
        int k =0;

        for (int i = n; i <=2* n; i++) {
            if (isSimpleNumber(i)){
                simple1[k] =i;
                k++;
            }
        }
        for (int i=0; i<k-1;i++){
            if(simple1[i+1]==simple1[i]+2){
                System.out.print(simple1[i+1]+" "+simple1[i]);
                System.out.println();
            }
        }
    }
}
