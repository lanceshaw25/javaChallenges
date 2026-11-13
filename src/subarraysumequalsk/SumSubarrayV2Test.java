package subarraysumequalsk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumSubarrayV2Test {

    @Test
    void subarraySum() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {1, 1, 1};
        int k = 2;
        int expected = 2;  // Explanation: [1, 1] occurs twice.
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }

    @Test
    void subarraySumSingleNumberIsK() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {1, 2, 3};
        int k = 3;
        int expected = 2;  // Explanation: [1, 2] and [3].
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }

    @Test
    void subarraySumNegativeNumbers() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {1, -1, 0};
        int k = 0;
        int expected = 3;  // Explanation: [1, -1], [0], and [1, -1, 0].
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }

    @Test
    void subarraySumSingleK() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {5};
        int k = 5;
        int expected = 1;  // Explanation: [5] matches itself
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }

    @Test
    void subarraySumNoMatchesK() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {1, 2, 3, 4, 5, -5, -4, -3, -2, -1};
        int k = 11;
        int expected = 0;  // Explanation: no sums up to 11
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }

    @Test
    void subarraySumNegativeNumbersToo() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {1, 2, 3, 4, 5, -5, -4, -3, -2, -1};
        int k = 0;
        int expected = 5;
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }

    @Test
    void subarraySumMultipleOverlapping() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {1, 2, 3, -3, 4, -5};
        int k = 6;
        int expected = 2;
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }

    @Test
    void subarraySumArrayTotalIsK() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int k = 21;
        int expected = 1;
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }

    @Test
    void subarraySumSeveralZeros() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {0, 0, 1, 0, 2, 0, 6};
        int k = 0;
        int expected = 5;
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }

    @Test
    void subarraySumAlllZeros() {
        var SumSubarray = new SumSubarrayV2();

        int[] nums = new int[] {0, 0, 0};
        int k = 0;
        int expected = 6;
        assertEquals(expected, SumSubarray.subarraySum(nums, k));
    }



}