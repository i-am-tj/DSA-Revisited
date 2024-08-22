package EasySet1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfArrIsSorted {

    public static boolean checkIfArrIsSorted(int[] arr, int n) {
        if(n == 0) return true;
        return (arr[n] > arr[n-1] && checkIfArrIsSorted(arr, n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Is array sorted? " +
                checkIfArrIsSorted(arr, n-1));
    }
}
