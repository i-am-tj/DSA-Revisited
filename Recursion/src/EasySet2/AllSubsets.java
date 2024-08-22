package EasySet2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllSubsets {

    public static void allSubsets(int[] nums, int idx, List<List<Integer>> res, List<Integer> curr) {
        if(idx == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        int val = nums[idx];
        allSubsets(nums, idx+1, res, curr);
        curr.add(val);
        allSubsets(nums, idx+1, res, curr);
        curr.removeLast();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        allSubsets(arr, 0, res, curr);
        System.out.println(res);
    }
}
