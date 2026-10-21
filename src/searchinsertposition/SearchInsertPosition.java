package searchinsertposition;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums == null ) {
            throw new IllegalArgumentException("nums is null");
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                // search in the lower half
                end = mid - 1;
            } else  {
                // search the upper half
                start = mid + 1;
            }
        }

        // not found, but start should now be updated to where it should be inserted
        return start;
    }
}
