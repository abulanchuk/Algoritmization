package decomposition11;

import java.util.Scanner;

public class InWhatNumberMoreDigits {

    public static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static String whatsMore(int a, int b){
        String result = "";
        if (a>b){
            result = "The First number is greater";
        }
        else{
            result = "The Second number is greater";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1= in.nextInt();
        int number2 = in.nextInt();

        int resNumber1 = getCountsOfDigits(number1);
        int resNumber2 = getCountsOfDigits(number2);
        String result = whatsMore(resNumber1, resNumber2);
        System.out.println(result);
    }
}
