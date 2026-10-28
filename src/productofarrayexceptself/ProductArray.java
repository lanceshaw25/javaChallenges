package productofarrayexceptself;

import utility.Debug;

import java.util.Arrays;

public class ProductArray {

    /**
     * Given an integer array nums, return an array answer such that answer[i] equals the product of every element in nums except nums[i].
     *
     * You must solve this without using division, in O(n) time.
     *
     * Constraints
     * 2 <= nums.length <= 100,000
     * -30 <= nums[i] <= 30
     * The product of any prefix or suffix is guaranteed to fit in a 32-bit integer.
     * The final answers are guaranteed to fit in a 32-bit integer.
     *
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];

        Debug.log("original nums= %s%n", Arrays.toString(nums));

        // first find product of everything from the left (except self)
        int productFromLeft = 1;
        for (int i = 0; i < nums.length; i++) {
            products[i] = productFromLeft;
            productFromLeft *= nums[i];
        }
        Debug.log("products from left= %s%n", Arrays.toString(products));

        // then multiply it by the product of everything from the right (except self)
        int productFromRight = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            products[i] = products[i] * productFromRight;
            productFromRight *= nums[i];
        }
        Debug.log("final products excluding itself= %s%n", Arrays.toString(products));

        return products;
    }
}
