package M9_Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int n = arr.length, max = Integer.MIN_VALUE;

        System.out.println("Before: " + Arrays.toString(arr));

        for(int x : arr)
            max = Math.max(x, max);

        int[] count = new int[max+1];

        for(int x : arr)
            count[x]++;

        for(int i=0, j=0; i<=max; i++) {
            while(count[i]-- > 0)
                arr[j++] = i;
        }

        System.out.println("After: " + Arrays.toString(arr));

    }
}
