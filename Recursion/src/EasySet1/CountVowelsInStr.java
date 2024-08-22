package EasySet1;

import java.util.Scanner;

public class CountVowelsInStr {

    public static boolean isVowel(char x) {
        return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');
    }

    public static int countVowels(String str, int n, int cnt) {
        if(n == -1) return cnt;
        char x = str.charAt(n);
        if(isVowel(x)) cnt++;
        return countVowels(str, n - 1, cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Number of vowels in " + str + ": " +
                countVowels(str, str.length()-1, 0));
    }
}
