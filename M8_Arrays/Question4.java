package M8_Arrays;

public class Question4 {
    public int trap(int[] height) {
        int n = height.length, result = 0, max = height[0];
        int[] left = new int[n];
        int[] right = new int[n];

        for(int i=1; i<n; i++) {
            if(height[i] > max) {
                max = height[i];
            } else {
                left[i] = max-height[i];
            }
        }

        max = height[n-1];
        for(int i=n-2; i>=0; i--) {
            if(height[i] > max) {
                max = height[i];
            } else {
                right[i] = max-height[i];
            }
        }

        for(int i=1; i<n; i++) {
            result += Math.min(left[i], right[i]);
        }

        return result;
    }

        /*
0  1  0  2  1  0  1  3  2  1  2  1      <- Given Array
0  0  1  0  1  2  1  0  1  2  1  2      <- Left Array
3  2  3  1  2  3  2  0  0  1  0  0      <- Right Array
0  0  1  0  1  2  1  0  0  1  0  0      <- Min(Left[i], Right[i])


4  2  0  3  2  5
0  2  4  1  2  0
1  3  5  2  3  0
0  2  4  1  2  0
        */
}
