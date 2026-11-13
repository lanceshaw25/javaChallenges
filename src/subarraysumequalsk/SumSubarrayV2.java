package subarraysumequalsk;

import utility.Debug;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumSubarrayV2 {

    /**
     * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose elements sum to k.
     *
     * A subarray must be contiguous and contain at least one element.
     *
     *  attempt to gen O(n) using hashmap for cumulative sum history
     *
     * @param nums
     * @param k
     * @return number of subarrays found that sum to k
     */
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // keep track of cumulative sum in a hashmap so we can lookup occurrences that would work as a starting point.
        Map<Integer, Integer> sumMap = new HashMap<>();  // cumlative sum, count
        sumMap.put(0, 1);

        Debug.log("target sum is %d%n", k);
        Debug.log("num array: %s%n", Arrays.toString(nums));

        // look for subarrays with the matching sum
        int currentSum = 0;
        int matches = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            // check sum history for the value we need
            matches += sumMap.getOrDefault(currentSum - k, 0);

            // put current value into the map history
            sumMap.merge(currentSum, 1, Integer::sum);
        }


        return matches;
    }


}
