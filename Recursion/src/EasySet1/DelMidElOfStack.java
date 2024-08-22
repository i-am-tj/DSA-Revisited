package EasySet1;

import java.util.Scanner;
import java.util.Stack;

public class DelMidElOfStack {

    public static void solve(Stack<Integer> s, int k) {
        if(k == 1) {
            s.pop();
            return;
        }
        int x = s.pop();
        solve(s, k-1);
        s.push(x);
    }

    public static void delMidElOfStack(Stack<Integer> s) {
        int n = s.size();
        int mid = (n/2) + 1;
        solve(s, mid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        delMidElOfStack(stack);
        System.out.println(stack);
    }
}
