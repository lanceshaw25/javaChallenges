package productofarrayexceptself;

import org.junit.jupiter.api.Test;
import utility.Debug;

import static org.junit.jupiter.api.Assertions.*;

class ProductArrayTest {

    @Test
    void productExceptSelf() {
        var debug = Debug.ENABLED;
        Debug.ENABLED = true;
        var productArray = new ProductArray();

        int[] input = new int[]{1, 2, 3, 4};
        int[] expectedOutput = new int[]{24, 12, 8, 6};

        assertArrayEquals(expectedOutput, productArray.productExceptSelf(input));
        Debug.ENABLED = debug;
    }

    @Test
    void productExceptSelfOneZero() {
        var productArray = new ProductArray();

        int[] input = new int[]{-1, 1, 0, -3, 3};
        int[] expectedOutput = new int[]{0, 0, 9, 0, 0};

        assertArrayEquals(expectedOutput, productArray.productExceptSelf(input));
    }

    @Test
    void productExceptSelfOnlyTwo() {
        var productArray = new ProductArray();

        int[] input = new int[]{2, 3};
        int[] expectedOutput = new int[]{3, 2};

        assertArrayEquals(expectedOutput, productArray.productExceptSelf(input));
    }

    @Test
    void productExceptSelfMultipleZeroes() {
        var productArray = new ProductArray();

        int[] input = new int[]{0, 0, 2};
        int[] expectedOutput = new int[]{0, 0, 0};

        assertArrayEquals(expectedOutput, productArray.productExceptSelf(input));
    }

    @Test
    void productExceptSelfMultipleNegatives() {
        var productArray = new ProductArray();

        int[] input = new int[]{-2, 3, -4};
        int[] expectedOutput = new int[]{-12, 8, -6};

        assertArrayEquals(expectedOutput, productArray.productExceptSelf(input));
    }
}