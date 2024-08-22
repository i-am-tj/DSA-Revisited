package BasicSet1;

import java.util.Scanner;

public class CountDigitsInNumber {

    public static int count(int num) {
        if(num == 0) return 0;
        return 1 + count(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Number of digits in a number: " + count(n));
    }
}
