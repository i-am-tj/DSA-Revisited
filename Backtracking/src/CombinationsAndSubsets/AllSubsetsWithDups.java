package CombinationsAndSubsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AllSubsetsWithDups {

    public static void allSubsetsWithDups(int[] arr, int start, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));
        for(int i = start; i < arr.length; i++) {
            if(i != start && arr[i] == arr[i-1]) {
                continue;
            }
            curr.add(arr[i]);
            allSubsetsWithDups(arr, i + 1, curr, res);
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
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        allSubsetsWithDups(arr, 0, curr, res);
        System.out.println(res);
    }
}
