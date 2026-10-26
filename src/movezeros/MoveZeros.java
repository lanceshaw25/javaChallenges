package movezeros;

import java.util.Arrays;

public class MoveZeros {

    /**
     * Given an integer array nums, move all zeroes to the end of the array while maintaining the relative order
     * of all nonzero elements.
     *
     * You must modify the original array in place, without making a copy of the entire array.
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) return;

        System.out.println("starting nums = " + Arrays.toString(nums));

        // walk up nums looking for a zero
        // when we find it, swap it with the next non zero value
        int nextNonZero = 1;
        for (int current = 0; current < nums.length; current++) {

            if (nums[current] == 0) {
                nextNonZero = findNextNonZero(nums, nextNonZero);

                // if there are no nonZero characters ahead of us, we are done
                if (nextNonZero == -1) { return; }

                // swap zero and non zero value
                nums[current] = nums[nextNonZero];
                nums[nextNonZero] = 0;
                System.out.printf("swapped zero in %d, for %d in pos=%d, nums = %s%n", current, nums[current], nextNonZero, Arrays.toString(nums));
                nextNonZero++;
            }
        }

    }

    /**
     * find the next non zero after the start Location
     *
     * @param nums
     * @param startLoc
     * @return the location of the next non zero, or -1 if at the end, or all the rest are zero
     */
    private int findNextNonZero(int[] nums, int startLoc) {
        if (nums.length == 1 || startLoc >= nums.length ) return -1;

        int loc = startLoc;

        while (loc < nums.length && nums[loc] == 0  ){
            loc++;
        };

        return loc < nums.length ? loc : -1;
    }
}
