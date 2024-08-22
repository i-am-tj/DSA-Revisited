package EasySet2;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void toh(int n, char s, char d, char m) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + s + " to " + d);
            return;
        }
        toh(n - 1, s, m, d);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
        toh(n - 1, m, d, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n, 'A', 'C', 'B');
    }
}
