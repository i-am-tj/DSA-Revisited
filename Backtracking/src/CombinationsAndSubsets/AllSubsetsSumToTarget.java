package CombinationsAndSubsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AllSubsetsSumToTarget {

    public static void allSubsetsSumToTarget(int[] arr, int target, int start, List<Integer> curr, List<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < arr.length; i++) {
            if(arr[i] > target) break;
            curr.add(arr[i]);
            allSubsetsSumToTarget(arr, target - arr[i], i + 1, curr, res);
            curr.removeLast();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        allSubsetsSumToTarget(arr, target, 0, new ArrayList<>(), res);
        System.out.println(res);
    }
}
