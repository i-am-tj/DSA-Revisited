package Permutations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KPermutationsOfNElements {

    public static void kPermutations(int[] arr, int k, int start, List<Integer> curr, List<List<Integer>> res) {
        if(curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < arr.length; i++) {
            curr.add(arr[i]);
            kPermutations(arr, k, i+1, curr, res);
            curr.removeLast();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        kPermutations(arr, k, 0, curr, res);
        System.out.println(res);
    }
}
