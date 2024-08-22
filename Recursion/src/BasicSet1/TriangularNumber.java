package BasicSet1;

import java.util.Scanner;

public class TriangularNumber {

    public static int triangularNumber(int n) {
        if (n == 0) return 0;
        return n + triangularNumber(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n +"th triangular number: " + triangularNumber(n));
    }
}
