package alg1;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        int [] myArray;
        myArray = new int [n];
        for (int i = 0; i < myArray.length; i++){
            myArray [i] = in.nextInt();
        }
        for(int i = 0;i<myArray.length; i++ ){

            if (myArray[i] % k == 0){
                sum = sum + myArray[i];
            }
        }
        System.out.println(sum);
    }

}
