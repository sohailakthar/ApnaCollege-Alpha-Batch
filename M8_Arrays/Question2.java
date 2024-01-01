package M8_Arrays;

public class Question2 {
    public int search(int[] nums, int target) {
        int n = nums.length;



        int transition = -1, low = 0, high = n-1;

        for(int i=1; i<n; i++) {
            if(nums[i] < nums[i-1]) {
                transition = i;
                break;
            }
        }

        if(transition != -1) {
            if(target > nums[n-1]) {
                high = transition-1;
            } else {
                low = transition;
            }
        }

        return binaryS(nums, target, low, high);
    }

    public int binaryS(int[] nums, int target, int low, int high) {
        while(low <= high) {
            int mid = (low+high)/2;

            if(nums[mid] == target)
                return mid;

            if(target > nums[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return -1;
    }
}
