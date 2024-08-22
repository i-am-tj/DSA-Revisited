package EasySet1;

import java.util.Scanner;

public class GeometricSeriesSum {

    public static int geometricSeriesSum(int a, int r, int n) {
        if(n == 1) return a;
        return a + (r * geometricSeriesSum(a, r, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();
        System.out.println("Geometric sum: " + geometricSeriesSum(a, r, n));
    }
}
