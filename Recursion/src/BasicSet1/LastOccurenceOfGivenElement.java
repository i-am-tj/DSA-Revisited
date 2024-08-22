package BasicSet1;

import java.util.Scanner;

public class LastOccurenceOfGivenElement {

    public static int lastOccurrence(int[] arr, int x, int n, int curr) {
        if(n == arr.length) return curr;
        if(arr[n] == x) curr = n;
        return lastOccurrence(arr, x, n+1, curr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }
        sc.nextLine();
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Last Occurrence of " + x + " in array is at index: " +
                lastOccurrence(arr, x, 0, -1));
    }
}
