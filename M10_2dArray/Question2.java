package M10_2dArray;

//Question: Print sum of numbers in second row of given 2D Array
public class Question2 {
    public static void main(String[] args) {
        int[][] nums = { {1,4,9}, {11,4,3}, {2,2,3} };
        int sum = 0;

        for(int i=0; i<nums[1].length; i++) {
            sum += nums[1][i];
        }

        System.out.println("Sum: " + sum);
    }
}
