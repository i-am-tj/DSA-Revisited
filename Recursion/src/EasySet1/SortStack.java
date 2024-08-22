package EasySet1;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {

    public static void insert(Stack<Integer> s, int k) {
        if(s.isEmpty() || s.peek() < k) {
            s.push(k);
            return;
        }
        int x = s.pop();
        insert(s, k);
        s.push(x);
    }

    public static void sort(Stack<Integer> stack) {
        if (stack.size() == 1) return;
        int x = stack.pop();
        sort(stack);
        insert(stack, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        sort(stack);
        System.out.println(stack);
    }
}
