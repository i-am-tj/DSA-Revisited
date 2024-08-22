package EasySet1;

import java.util.Scanner;

public class CatalanNumber {

    public static int catalan(int n) {
        if(n <= 1) return 1;
        int res = 0;
        for(int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + "th catalan number: " + catalan(n));
    }
}
