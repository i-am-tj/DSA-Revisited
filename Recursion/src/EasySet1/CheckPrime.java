package EasySet1;

import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int n, int i) {
        if(i*i > n) return true;
        return (n % i != 0) && isPrime(n, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Is " + n + " prime? " +
                isPrime(n,2));
    }
}
