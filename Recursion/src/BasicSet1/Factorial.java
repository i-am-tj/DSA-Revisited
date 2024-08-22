package BasicSet1;

import java.util.Scanner;

public class Factorial {

    // Note: Integer value can sustain till 12!
    // and long can sustain till 20!
    // Beyond that we can use BigInteger

    public static  long factorial(int n) {
        if(n < 0) throw new IllegalArgumentException();
        if(n==0 || n==1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " : " + factorial(n));
    }
}
