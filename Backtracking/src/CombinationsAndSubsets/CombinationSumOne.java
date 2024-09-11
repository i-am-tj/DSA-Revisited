package CombinationsAndSubsets;

import java.util.*;

public class CombinationSumOne {

    public static void combinationSum(int[] arr, int target, int start,
                                      List<Integer> curr, Set<List<Integer>> res) {
        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0 || start >= arr.length) {
            return;
        }
        for(int i = start; i < arr.length; i++) {
            curr.add(arr[i]);
            combinationSum(arr, target - arr[i], i, curr, res);
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
        Set<List<Integer>> res = new HashSet<>();
        combinationSum(arr, target, 0, new ArrayList<>(), res);
        System.out.println(res);
    }
}
