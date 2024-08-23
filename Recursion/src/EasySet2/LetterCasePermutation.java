package EasySet2;

import java.util.Scanner;

public class LetterCasePermutation {

    public static char transposeChar(char c) {
        if(Character.isUpperCase(c)){
            return Character.toLowerCase(c);
        } else  {
            return Character.toUpperCase(c);
        }
    }

    public static void letterCasePermutation(String s, String res){
        if(s.isEmpty()) {
            System.out.print(res + " ");
            return;
        }
        char ch = s.charAt(0);
        if(!Character.isDigit(ch)){
            char changed = transposeChar(ch);
            letterCasePermutation(s.substring(1), res+changed);
        }
        letterCasePermutation(s.substring(1), res+ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        letterCasePermutation(s, "");
    }
}
