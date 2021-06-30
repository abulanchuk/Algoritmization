package decomposition9;

import java.util.Scanner;

public class AreaOfQuadrangle {

    public static double area(int x, int y, int z, int t) {
        double area = 0;
        double diagonal = Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
        double areaOfFirstTriangle = (x * y) / 2;
        double halfOfPerimetr = (t+z+diagonal) / 2;
        double theHeightOfTheTriangle = (2 * Math.sqrt(halfOfPerimetr * (halfOfPerimetr - diagonal) * (halfOfPerimetr - z) * (halfOfPerimetr - t))) / t;
        double areaofSecondTriange = (t * theHeightOfTheTriangle) / 2;
        area = areaOfFirstTriangle + areaofSecondTriange;
        return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int t = in.nextInt();

        double result = area(x, y, z, t);
        System.out.println(result);
    }
}
