package EasySet1;

import java.util.Scanner;

public class NPowerX {

    public static long power(int x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n % 2 == 0) return power(x, n/2)*power(x, n / 2);
        return x*power(x, n/2)*power(x, n/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(n + " to the power " + x + ": " + power(n,x));
    }
}
