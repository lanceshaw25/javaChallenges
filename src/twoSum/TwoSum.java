package twoSum;

import java.util.Arrays;

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
 * time: 0(n^2) Space O(1)
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] + nums[j] == target) { return new int[] { i, j }; }
            }
        }

        return null;
    }

    static void main() {
        TwoSum twoSum = new TwoSum();

        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{3, 3}, 6)));

    }
}
