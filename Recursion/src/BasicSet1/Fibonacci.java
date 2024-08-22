package BasicSet1;

import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n) {
        if(n < 0) throw new IllegalArgumentException();
        if(n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series upto " + n + " terms ");
        for(int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
