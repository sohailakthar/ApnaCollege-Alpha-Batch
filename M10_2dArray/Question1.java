package M10_2dArray;

// Question: Count number of 7s in given 2D Array
public class Question1 {
    public static void main(String[] args) {
        int result = 0;
        int[][] array = { {4, 7, 8}, {8, 8, 7} };

        for(int[] arr : array) {
            for(int num : arr) {
                if(num == 7)
                    result++;
            }
        }

        System.out.println("Total 7s in given array: " + result);
    }
}
