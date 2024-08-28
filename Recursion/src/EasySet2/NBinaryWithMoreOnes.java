package EasySet2;

import java.util.Scanner;

public class NBinaryWithMoreOnes {

    public static void printBinary(int n, int ones, int zeros, String curr) {
        if(n == 0) {
            System.out.println(curr);
            return;
        }
        printBinary(n -1, ones + 1, zeros, curr + "1");
        if(ones > zeros) {
            printBinary(n - 1, ones, zeros + 1, curr + "0");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printBinary(n, 0, 0,"");
    }
}
