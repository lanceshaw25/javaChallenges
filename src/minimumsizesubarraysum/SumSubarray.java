package minimumsizesubarraysum;

import utility.Debug;

public class SumSubarray {

    public int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int minLength = 0;  // assume no solution until we find one

        int start = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // this needs to loop and move start forward until sum < target or  start = i
            // we still want to do the matching check if start = i, but not advance start and exit loop.
            while (sum >= target) {
                // found a solution
                int matchLength = i - start + 1;
                Debug.log("sum %d is a solution at start %d, and current location %d. match length is %d%n", sum, start, i, matchLength);
                if (minLength == 0 || minLength > matchLength) {
                    minLength = matchLength;
                    Debug.log("setting minLength to %d%n", minLength);
                }

                if (start == i) {
                    // the current number meets the criteria, with a length 1.  It will never be smaller.
                    Debug.log("start equals the current position and sum hits target. maxlength is 1%n");
                    return 1;
                }

                sum -= nums[start++];
                Debug.log("adjusting sum=%d, and start=%d%n", sum);
            }
        }


        return minLength;
    }
}
