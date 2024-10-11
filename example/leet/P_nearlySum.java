package leet;

import java.util.Arrays;

public class P_nearlySum {
    public int threeSumClosed(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right){
                int MIN = nums[i] + nums[left] + nums[right];
                if (Math.abs(MIN - target) < Math.abs(closestSum - target))
                    closestSum = MIN;
                if (MIN == target) return MIN;
                if (MIN < target) left++;
                else right--;
            }
        }
        return closestSum;
    }
}
