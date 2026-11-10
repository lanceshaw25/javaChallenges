package minimumsizesubarraysum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumSubarrayTest {

    @Test
    void minSubArrayLen() {
        var sumSubarray = new SumSubarray();

        int[] nums = new int[] {2, 3, 1, 2, 4, 3};
        int target = 7;
        int expected = 2;

        assertEquals(expected, sumSubarray.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLenOneValueEqualTarget() {
        var sumSubarray = new SumSubarray();

        int[] nums = new int[] {1, 4, 4};
        int target = 4;
        int expected = 1;

        assertEquals(expected, sumSubarray.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLenNoSolution() {
        var sumSubarray = new SumSubarray();

        int[] nums = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        int expected = 0;

        assertEquals(expected, sumSubarray.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLenEntireArray() {
        var sumSubarray = new SumSubarray();

        int[] nums = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 8;
        int expected = 8;

        assertEquals(expected, sumSubarray.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLenSingleTargetElement() {
        var sumSubarray = new SumSubarray();

        int[] nums = new int[] {5};
        int target = 5;
        int expected = 1;

        assertEquals(expected, sumSubarray.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLenMultipleValids() {
        var sumSubarray = new SumSubarray();

        int[] nums = new int[] {1,2,3,4,2,4,6,4,3};
        int target = 10;
        int expected = 2;

        assertEquals(expected, sumSubarray.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLenMultipleValidsToo() {
        var sumSubarray = new SumSubarray();

        int[] nums = new int[] {2, 3, 1, 2, 4, 3};
        int target = 7;
        int expected = 2;

        assertEquals(expected, sumSubarray.minSubArrayLen(target, nums));
    }

    @Test
    void minSubArrayLenEmptyOrNullNums() {
        var sumSubarray = new SumSubarray();

        int[] nums = new int[] {};
        int target = 5;
        int expected = 0;

        assertEquals(expected, sumSubarray.minSubArrayLen(target, nums));
        assertEquals(expected, sumSubarray.minSubArrayLen(target, null));
    }
}