package EasySet2;

import java.util.Scanner;

public class SubsequencesOfStr {

    public static void printSubsequences(String str, String res) {
        if(str.isEmpty()){
            System.out.print(res + " ");
            return;
        }
        char ch = str.charAt(0);
        printSubsequences(str.substring(1), res+ch);
        printSubsequences(str.substring(1), res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        printSubsequences(str, res);
        System.out.println();
    }
}
