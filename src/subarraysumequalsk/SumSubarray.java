package subarraysumequalsk;

import utility.Debug;

import java.util.Arrays;

public class SumSubarray {

    /**
     * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose elements sum to k.
     *
     * A subarray must be contiguous and contain at least one element.
     *
     * This ones O(n^2) :-(
     *
     * @param nums
     * @param k
     * @return number of subarrays found that sum to k
     */
    public int subarraySum(int[] nums, int k) {
        Debug.ENABLED = true;
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] cumulativeSums = new int[nums.length];
        cumulativeSums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cumulativeSums[i] = cumulativeSums[i - 1] + nums[i];
        }

        Debug.log("target sum is %d%n", k);
        Debug.log("num array: %s%n", Arrays.toString(nums));
        Debug.log("cumulativeSums: %s%n", Arrays.toString(cumulativeSums));

        // look for subarrays with the matching sum
        int matches = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                Debug.log("found match of single element at position %d", i);
                matches++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                int segmentSum = cumulativeSums[j] - cumulativeSums[i] + nums[i];
                Debug.log("for position %d to %d, segmentSum: %s%n", i, j, segmentSum);
                if (segmentSum == k) {
                    Debug.log("found match for positon %d to %d%n", i, j);
                    matches++;
                }
            }
        }


        return matches;
    }


}
