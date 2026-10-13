package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Today's problem: Two Sum
 *
 * Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to target.
 *
 * You may assume:
 *
 * There is exactly one solution.
 * You cannot use the same element twice.
 * You may return the indices in any order.
 *
 * Input:  nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 *
 * Explanation:
 * nums[0] + nums[1] = 2 + 7 = 9
 *
 * Input:  nums = [3, 2, 4], target = 6
 * Output: [1, 2]
 *
 * Input:  nums = [3, 3], target = 6
 * Output: [0, 1]
 *
 * nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * target = 17
 *
 * time: 0(N) space O(N)
 */
public class TwoSumV2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int need = target - nums[i];
            if (numsMap.containsKey(need)) {
                return new int[]{numsMap.get(need), i};
            }

            // add i value after check incase we need two fo the value in i...
            numsMap.put(nums[i], i);  // value, location
        }

        return null;
    }

    static void main() {
        TwoSumV2 twoSum = new TwoSumV2();

        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 17)));

    }
}
