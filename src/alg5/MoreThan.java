package alg5;

import java.util.Scanner;

public class MoreThan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] myArray = new int[n];
        for (int i = 0; i< myArray.length; i++){
            myArray[i] = in.nextInt();
        }
        for (int i = 0; i< myArray.length; i++){
            if (myArray[i]> i){
                System.out.println(myArray[i]);
            }
        }
    }
}
