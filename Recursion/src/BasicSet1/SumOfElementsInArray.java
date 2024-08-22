package BasicSet1;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsInArray {
    public static int sum(int[] arr, int n) {
        if(n == -1) return 0;
        return arr[n] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        System.out.println("Sum of all elements in the array: " + sum(arr, n-1));
    }
}
