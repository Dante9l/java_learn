package leet;

import java.util.*;

public class O_threeNumAdd {
    public List<List<Integer>> threeSum (int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        // 对数组进行排序
        Arrays.sort(nums);

        // 遍历数组
        for (int i = 0; i < nums.length - 2; i++) {
            // 跳过重复的 'i' 值
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 跳过重复的 left 和 right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                 else
                    right--;
            }
        }

        return result;
    }
}
