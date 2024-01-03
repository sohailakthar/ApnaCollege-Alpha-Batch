package M9_Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int n = arr.length;

        System.out.println("Before: " + Arrays.toString(arr));

        for(int i=0; i<n; i++) {
            for(int j=1; j<n; j++) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j);
                }
            }
        }

        System.out.println("After: " + Arrays.toString(arr));

    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
