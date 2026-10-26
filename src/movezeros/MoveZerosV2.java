package movezeros;

import java.util.Arrays;

public class MoveZerosV2 {

    /**
     * Given an integer array nums, move all zeroes to the end of the array while maintaining the relative order
     * of all nonzero elements.
     *
     * You must modify the original array in place, without making a copy of the entire array.
     *
     * use a read and a write pointer instead of a function to look ahead and find the next non zero
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) return;

        System.out.println("starting nums = " + Arrays.toString(nums));

        int writeLocation = 0;

        // walk up nums writing non zeros back at write position as we find them
        // when we find it, swap it with the next non zero value
        for (int readLocation = 0; readLocation < nums.length; readLocation++) {
            // when we find a non zero value, write it at write location and advance 1
            if (nums[readLocation] != 0) {
                System.out.printf("value at readLocation= %d is %d%n", readLocation, nums[readLocation]);
                System.out.printf("destination Location= %d is %d%n", writeLocation, nums[writeLocation]);
                System.out.printf("current nums = %s%n", Arrays.toString(nums));

                if (writeLocation < readLocation) {
                    nums[writeLocation] = nums[readLocation];
                    nums[readLocation] = 0;
                }
                writeLocation++;
                System.out.printf("updated nums = %s%n", Arrays.toString(nums));
            }
        }

    }

}
