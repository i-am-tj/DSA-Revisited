package EasySet2;

import java.util.Scanner;

public class PermutationWithSpaces {

    public static void permWithSpaces(String s, String res) {
        if(s.isEmpty()) {
            System.out.println(res);
            return;
        }
        char ch = s.charAt(0);
        permWithSpaces(s.substring(1), res+" "+ch);
        permWithSpaces(s.substring(1), res+ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = s.substring(0, 1);
        permWithSpaces(s.substring(1), res);
    }
}
