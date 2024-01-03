package M9_Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int n = arr.length;

        System.out.println("Before: " + Arrays.toString(arr));

        for(int i=1; i<n; i++) {
            int index = i;
            while(index>0 && arr[index] < arr[index-1]) {
                swap(arr, index);
                index--;
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