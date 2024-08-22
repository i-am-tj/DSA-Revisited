package EasySet2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSubsequencesOfStr {

    public static void uniqueSubsequences(String str, String res, Set<String> s) {
        if(str.isEmpty()) {
            if(res.isEmpty()) s.add(" ");
            else s.add(res);
            return;
        }
        char curr = str.charAt(0);
        uniqueSubsequences(str.substring(1), res, s);
        uniqueSubsequences(str.substring(1), res+curr, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<String> s = new HashSet<>();
        uniqueSubsequences(str, "", s);
        System.out.println(s);
    }
}
