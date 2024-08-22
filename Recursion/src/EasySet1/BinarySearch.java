package EasySet1;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int x, int lo, int hi) {
        if(lo > hi) return -1;
        int mid = (hi - lo) / 2 + lo;
        if(arr[mid] == x) return mid;
        if(arr[mid] > x) return binarySearch(arr, x, lo, mid-1);
        else return binarySearch(arr, x, mid+1, hi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(x + " is present at index: " +
                binarySearch(arr, x, 0, arr.length-1));
    }
}
