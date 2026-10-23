package maximumaveragesubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAverageTest {

    @Test
    void findMaxAverage() {
        MaxAverage search = new MaxAverage();

        int[] nums = new int[] { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        var expected = 12.75;

        assertEquals(expected, search.findMaxAverage(nums, k), 1e-5);
    }

    @Test
    void findMaxAverageSingle() {
        MaxAverage search = new MaxAverage();

        int[] nums = new int[] { 5 };
        int k = 1;
        var expected = 5.0;

        assertEquals(expected, search.findMaxAverage(nums, k), 1e-5);
    }

    @Test
    void findMaxAverageBigger() {
        MaxAverage search = new MaxAverage();

        int[] nums = {
                12, -5,  8,  3, -11,  20,  4,  -2,  15, -7,
                6,  18, -9,  2,  11,  -4,  25,  1, -13,  9,
                5, -6,  14,  7, -10,  22,  3,  -1,  16, -8,
                19,  -3,  10,  4, -12,  28,  6,  -5,  13,  2,
                -9,  17,   1,  21, -4,   8,  11,  -2,  24,  5
        };

        int k = 7;
        var expected = 9.0;

        assertEquals(expected, search.findMaxAverage(nums, k), 1e-5);
    }

    @Test
    void findMaxAveragek1() {
        MaxAverage search = new MaxAverage();

        int[] nums = {
                12, -5,  8,  3, -11,  20,  4,  -2,  15, -7,
                6,  18, -9,  2,  11,  -4,  25,  1, -13,  9,
                5, -6,  14,  7, -10,  22,  3,  -1,  16, -8,
                19,  -3,  10,  4, -12,  28,  6,  -5,  13,  2,
                -9,  17,   1,  21, -4,   8,  11,  -2,  24,  5
        };

        int k = 1;
        var expected = 28.0;

        assertEquals(expected, search.findMaxAverage(nums, k), 1e-5);
    }

    @Test
    void findMaxAverageKNumLength() {
        MaxAverage search = new MaxAverage();

        int[] nums = {
                12, -5,  8,  3, -11,  20,  4,  -2,  15, -7,
                6,  18, -9,  2,  11,  -4,  25,  1, -13,  9,
                5, -6,  14,  7, -10,  22,  3,  -1,  16, -8,
                19,  -3,  10,  4, -12,  28,  6,  -5,  13,  2,
                -9,  17,   1,  21, -4,   8,  11,  -2,  24,  5
        };

        int k = nums.length;
        var expected = 5.18;

        assertEquals(expected, search.findMaxAverage(nums, k), 1e-5);
    }

    @Test
    void findMaxAverageAllNegative() {
        MaxAverage search = new MaxAverage();

        int[] nums = {
                -5,  -11,  -2, -7,
                 -9,  -4,  -13, -6
        };

        int k = 4;
        var expected = -5.5;

        assertEquals(expected, search.findMaxAverage(nums, k), 1e-5);
    }


}