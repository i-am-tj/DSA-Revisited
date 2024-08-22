package BasicSet1;

import java.util.Scanner;

public class ProductOfElementsInArray {

    public static long product(int[] arr, int n) {
        if(n == -1) return 1;
        return arr[n] * product(arr, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        System.out.println("Product of all elements in array: " +
                product(arr, n-1));
    }
}
