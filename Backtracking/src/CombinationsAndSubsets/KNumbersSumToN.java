package CombinationsAndSubsets;

import java.util.*;

public class KNumbersSumToN {

    public static void kSumToN(int index, int target, int k, List<Integer> curr, Set<List<Integer>> res) {
        if(curr.size() == k && target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(curr.size() >= k || target < index) {
            return;
        }
        for(int i = index; i <= 9; i++) {
            curr.add(i);
            kSumToN(i, target - i, k, curr, res);
            curr.removeLast();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> curr = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        kSumToN(1, n, k, curr, res);
        System.out.println(res);
    }
}
