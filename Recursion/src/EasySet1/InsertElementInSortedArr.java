package EasySet1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertElementInSortedArr {

    public static void insertInPos(List<Integer> l, int k) {
        if(l.isEmpty() || l.getLast() < k) {
            l.add(k);
            return;
        }
        int x = l.getLast();
        l.removeLast();
        insertInPos(l, k);
        l.add(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();
        insertInPos(list, k);
        System.out.println(list);
    }
}
