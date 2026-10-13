package twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

//    TwoSum testClass = new TwoSum();
    TwoSumV2 testClass = new TwoSumV2();

    @Test
    void findsTwoNumbersThatAddToTarget() {
        assertArrayEquals(
                new int[]{0, 1},
                testClass.twoSum(new int[]{2, 7, 11, 15}, 9)
        );
    }

    @Test
    void findsTwoNumbersSolutionNearEnd() {
        assertArrayEquals(
                new int[]{1, 2},
                testClass.twoSum(new int[]{3, 2, 4}, 6)
        );

        assertArrayEquals(
                new int[]{7, 8},
                testClass.twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 17)
        );
    }

    @Test
    void findsTwoNumbersSolutionDuplicateValues() {
        assertArrayEquals(
                new int[]{0, 1},
                testClass.twoSum(new int[]{3, 3}, 6)
        );
    }
}