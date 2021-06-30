package decomposition3;

import java.util.Scanner;

public class AreaOfHexagon {
    public static float AreaOfTriangle(float a) {
        float area = (float) ((Math.sqrt(3) * a * a) / 4);
        return area;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        float areaOfTriangle = AreaOfTriangle(a);

        float areaOfHexagon = 6 * areaOfTriangle;
        System.out.println(areaOfHexagon);
    }
}
