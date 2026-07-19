//"GET THE MINIMUM ELEMENT AND SWAP IT ONE BY ONE FROM THE START" - SELECTION SORT

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 3, 8, 2, 6, 4, 5};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int x : arr)
            System.out.print(x + " ");
    }
}
