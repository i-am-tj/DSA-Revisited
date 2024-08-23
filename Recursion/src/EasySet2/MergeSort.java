package EasySet2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp[k++] = arr1[i++];
            } else {
                temp[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            temp[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            temp[k++] = arr2[j++];
        }
        return temp;
    }

    public static int[] sort(int[] arr, int start, int end) {
            if(start == end) {
                int[] temp = new int[1];
                temp[0] = arr[start];
                return temp;
            }
            int mid = (start + end) / 2;
            int[] arr1 = sort(arr, start, mid);
            int[] arr2 = sort(arr, mid+1, end);
            return merge(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = sort(arr, 0, n-1);
        System.out.println("Sorted Array: " + Arrays.toString(res));
    }
}
