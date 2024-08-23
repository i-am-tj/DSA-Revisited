package EasySet2;

import java.util.Scanner;

public class PermutationWithCaseChange {

    public static void permWithCaseChange(String s, String res) {
        if(s.isEmpty()) {
            System.out.print(res + " ");
            return;
        }
        char ch = s.charAt(0);
        char changed = (char) ((int)ch - ('a' - 'A'));
        permWithCaseChange(s.substring(1), res + changed);
        permWithCaseChange(s.substring(1), res + ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        permWithCaseChange(s, "");
    }
}
