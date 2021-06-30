package alg2;

import java.util.Scanner;

public class ChangeElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] myArray= new int[n];
        int k=in.nextInt();
        int count = 0;
        for (int i = 0; i < myArray.length; i++){
            myArray[i]= in.nextInt();
        }
        for (int i = 0; i< myArray.length; i++){
            if (myArray[i]>k){
                myArray[i] = k;
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
