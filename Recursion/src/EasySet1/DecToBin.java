package EasySet1;

import java.util.Scanner;

public class DecToBin {

    public static String decToBin(int n, String bin) {
        if(n == 1) return "1";
        return decToBin(n/2, bin) + "" + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decToBin(n, ""));
    }
}
