package movezeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @Test
    void moveZeroes() {
        var moveZeros = new MoveZeros();

        int[] nums = new int[] {0, 1, 0, 3, 12};
        int[] expected = new int[] {1, 3, 12, 0, 0};
        moveZeros.moveZeroes(nums);

        // nums should by changed in place
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroesOnlyZero() {
        var moveZeros = new MoveZeros();

        int[] nums = new int[] {0};
        int[] expected = new int[] {0};
        moveZeros.moveZeroes(nums);

        // nums should by changed in place
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroesOnlyZeros() {
        var moveZeros = new MoveZeros();

        int[] nums = new int[] {0,0,0};
        int[] expected = new int[] {0,0,0};
        moveZeros.moveZeroes(nums);

        // nums should by changed in place
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroesNoZeros() {
        var moveZeros = new MoveZeros();

        int[] nums = new int[] {1, 2, 3};
        int[] expected = new int[] {1, 2, 3};
        moveZeros.moveZeroes(nums);

        // nums should by changed in place
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroesToo() {
        var moveZeros = new MoveZeros();

        int[] nums = new int[] {0, 0, 1, 0, 2, 0, 3};
        int[] expected = new int[] {1, 2, 3, 0, 0, 0, 0};
        moveZeros.moveZeroes(nums);

        // nums should by changed in place
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveZeroesNullOrEmpty() {
        var moveZeros = new MoveZeros();

        int[] nums = new int[0];
        int[] expected = new int[0];
        moveZeros.moveZeroes(nums);

        // nums should by changed in place
        assertArrayEquals(expected, nums);
    }
}