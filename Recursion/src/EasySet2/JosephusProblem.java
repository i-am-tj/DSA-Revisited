package EasySet2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {

    public static void josephusProblem(int n, int k, List<Integer> l, int curr) {
        if(l.size() == 1) {
            System.out.println(l.get(0));
            return;
        }
        l.remove((curr + k) % n);
        josephusProblem(n-1, k, l, curr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }
        josephusProblem(n, k-1, list, 0);
    }
}
