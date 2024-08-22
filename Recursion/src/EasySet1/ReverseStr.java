package EasySet1;

import java.util.Scanner;

public class ReverseStr {

    public static String swap(String s, int i, int j) {
        char[] chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    public static String reverse(String str, int i, int j) {
        if(i >= j) return str;
        String replaced = swap(str, i, j);
        return reverse(replaced, i+1, j-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str, 0, str.length()-1));
    }
}
