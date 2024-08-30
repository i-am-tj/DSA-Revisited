package Permutations;

import java.util.*;

public class AllPermutationsOfString {

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void allPermutations(char[] ch, int curr, Set<String> res) {
        if(curr == ch.length - 1) {
            res.add(new String(ch));
            return;
        }
        for(int i = curr; i < ch.length; i++) {
            swap(ch, curr, i);
            allPermutations(ch, curr + 1, res);
            swap(ch, curr, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Set<String> res = new HashSet<>();
        allPermutations(arr, 0, res);
        System.out.println(res);
    }
}
