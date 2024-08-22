package EasySet1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    public static void insert(Stack<Integer> s, int x) {
        if(s.isEmpty()) {
            s.push(x);
            return;
        }
        int k = s.pop();
        insert(s, x);
        s.push(k);
    }

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) return;
        int x = s.pop();
        reverse(s);
        insert(s, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.println("Original: " + stack);
        reverse(stack);
        System.out.println("Reversed: " + stack);
    }
}
