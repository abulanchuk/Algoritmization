package alg4;

import java.util.Scanner;

public class ChangeMaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] myArray = new int[n];
        for (int i = 0; i<myArray.length; i++){
            myArray[i] = in.nextInt();
        }
        int max = myArray[0];
        int min = myArray[0];
        for (int i = 0; i< myArray.length; i++){
            if (myArray[i]> max ){
                max = myArray[i];
            }
        }
        for (int i = 0; i< myArray.length; i++){
            if (myArray[i]< min ){
                min = myArray[i];
            }
        }
        System.out.println("max element is "+max);
        System.out.println("min element is "+min);
    }
}
