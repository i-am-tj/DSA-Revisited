package BasicSet1;

import java.util.Scanner;

public class MaxElementInArray {

    public static int maximum(int[] arr, int n, int max) {
        if(n == -1) return max;
        if(arr[n] > max) max = arr[n];
        return Math.max(max, maximum(arr, n-1, max));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        System.out.println("Maximum element in the array: " +
                maximum(arr, n-1, Integer.MIN_VALUE));
    }
}
