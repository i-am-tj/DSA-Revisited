package Permutations;

import java.util.*;

public class AllPermutationsOfStringWithDups {

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void allPermutations(char[] arr, int curr, Set<String> res) {
        if(curr == arr.length - 1) {
            res.add(new String(arr));
            return;
        }
        Set<Character> set = new HashSet<>();
        for(int i = curr; i < arr.length; i++) {
            if(set.add(arr[i])) {
                swap(arr, i, curr);
                allPermutations(arr, curr + 1, res);
                swap(arr, i, curr);
            }
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
