package M9_Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int n = arr.length;

        System.out.println("Before: " + Arrays.toString(arr));

        for(int i=0; i<n; i++) {
            int minpos = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[minpos])
                    minpos = j;
            }

            swap(arr, i, minpos);
        }

        System.out.println("After: " + Arrays.toString(arr));

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}