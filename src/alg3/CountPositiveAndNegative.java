package alg3;

import java.util.Scanner;

public class CountPositiveAndNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int myArray [] = new int[n];
        int negative =0;
        int nullInArray = 0;
        int positive = 0;
        for (int i = 0; i< myArray.length; i++){
            myArray[i] = in.nextInt();
        }
        for (int i =0; i< myArray.length; i++){
            if (myArray[i]<0){
                negative += 1;
            }
            else if (myArray[i] > 0){
                positive +=1;
            }
            else {
                nullInArray +=1;
            }
        }
        System.out.println("количество положительных чисел " + positive);
        System.out.println("количество отрицательных чисел " + negative);
        System.out.println("количество нулей " + nullInArray);
    }
}
