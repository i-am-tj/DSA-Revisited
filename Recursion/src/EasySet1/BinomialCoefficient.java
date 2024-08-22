package EasySet1;

import java.util.Scanner;

public class BinomialCoefficient {

    public static long fact(int n) {
        if(n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

    public static long binomialCoefficient(int n, int r) {
        if(r > n) return 0;
        return fact(n) / (fact(r) * fact(n-r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("C(" + n + "," + r + "): " +
                binomialCoefficient(n, r));
    }
}
