package BasicSet1;

import java.util.Scanner;

public class MinElementInArray {

    public static int minimum(int[] arr, int n, int min) {
        if (n == -1) return min;
        if (arr[n] < min) min = arr[n];
        return Math.min(min, minimum(arr, n-1, min));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        System.out.println("Min element in the array: " +
                minimum(arr, n-1, Integer.MAX_VALUE));
    }
}
