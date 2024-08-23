package EasySet1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArr {

    public static void insert(List<Integer> l, int k) {
        if(l.isEmpty() || l.getLast() < k) {
            l.add(k);
            return;
        }
        int x = l.getLast();
        l.removeLast();
        insert(l, k);
        l.add(x);
    }

    public static void sortArr(List<Integer> l) {
        if(l.size() == 1) return;
        int k = l.getLast();
        l.removeLast();
        sortArr(l);
        insert(l, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sortArr(list);
        System.out.println(list);
    }
}
