package maximumaveragesubarray;

import java.util.Arrays;

public class MaxAverage {

    /**
     * Given an integer array nums consisting of n elements, and an integer k, find a contiguous subarray of length exactly k that has the maximum average value.
     *
     * Return the maximum average.
     *
     * Your answer will be accepted if it is within 10^-5 of the correct answer.
     *
     * n == nums.length
     *
     * 1 <= k <= n <= 100,000
     *
     * -10,000 <= nums[i] <= 10,000
     *
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length < k || k < 1) {
            throw new IllegalArgumentException();
        }

        // find sum of the first k elements
        double rollingSum = 0;
        for (int i = 0; i < k; i++) {
            rollingSum += nums[i];
        }

        // advance through the list looking for a bigger rolling sum
        int maxStartIndex = 0;
        double maxSum = rollingSum;
        for (int i = k; i <  nums.length; i++) {
            // drop off the first number, and add the next
            rollingSum -= nums[i-k];
            rollingSum += nums[i];

            // if the rollingSum is now greater than maxSum, update maxSum and the start location
            if (rollingSum > maxSum) {
                maxSum = rollingSum;
                maxStartIndex = i - k + 1;
            }
        }

        // this informative message could be removed, and then we don't need to keep track of maxStartIndex
        System.out.printf("the array with the max average is at start index %d, array=%s%n", maxStartIndex,
                Arrays.toString(Arrays.copyOfRange(nums, maxStartIndex, maxStartIndex + k)));

        return maxSum / (double) k;
    }

}
