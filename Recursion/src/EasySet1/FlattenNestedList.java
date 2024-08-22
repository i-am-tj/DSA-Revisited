package EasySet1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlattenNestedList {

    public static void flatten(List<List<Integer>> list, int i, int j,
                               int n, int m, List<Integer> res) {
        if(j == m) {
            i += 1;
            j = 0;
        }
        if(i == n) return;
        res.add(list.get(i).get(j));
        flatten(list, i, j + 1, n, m, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> curr = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                curr.add(sc.nextInt());
            }
            list.add(new ArrayList<>(curr));
            curr.clear();
        }
        List<Integer> res = new ArrayList<>();
        flatten(list, 0, 0, n, m, res);
        System.out.println("Flattened List: " + res);
    }
}
