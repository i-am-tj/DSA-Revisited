package EasySet2;

import java.util.Scanner;

public class GenerateAllBalancedParenthesis {

    public static void generateAllBalancedParenthesis(int open, int closed, String curr) {
        if(open == 0 && closed == 0) {
            System.out.println(curr);
            return;
        }
        if(open > 0) {
            generateAllBalancedParenthesis(open - 1, closed, curr + "(");
        }
        if(open < closed) {
            generateAllBalancedParenthesis( open, closed - 1, curr + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateAllBalancedParenthesis(n, n, "");
    }
}
