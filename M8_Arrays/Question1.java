package M8_Arrays;

import java.util.*;

public class Question1 {
    public static boolean containsDuplicateBruteforce(int[] nums) {
        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1])
                return true;
        }

        return false;
    }


    public boolean containsDuplicateSet(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int x : nums) {
            if(!set.add(x)) {
                return true;
            }
        }

        return false;
    }
}
