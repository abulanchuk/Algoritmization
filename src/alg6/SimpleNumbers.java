package alg6;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] myArray = new int[n];

        for (int i = 0; i< myArray.length; i++){
            myArray[i] = in.nextInt();
        }
        for (int i = 0; i< myArray.length; i++){
            boolean flag = false;
            for (int j = 2; j < myArray[i];j++){
               if( myArray[i]% j ==0){
                   flag = true;
                   break;
               }
            }
            if (flag == false) {
                System.out.println(myArray[i]);
            }
        }
    }
}
