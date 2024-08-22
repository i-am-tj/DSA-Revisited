package EasySet1;

import java.util.Scanner;

public class CheckPalindrome {

    public static boolean check(String s, int i, int j) {
        if(i >= j) return true;
        return s.charAt(i) == s.charAt(j) && check(s, i+1, j-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Is " + str + " a palindrome? " +
                check(str, 0, str.length()-1));
    }
}
