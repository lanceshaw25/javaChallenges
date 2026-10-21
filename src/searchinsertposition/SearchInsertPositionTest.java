package searchinsertposition;

import besttimetosellstock.StockProfit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SearchInsertPositionTest {

    @Test
    void searchPositionFound() {
        SearchInsertPosition  search = new SearchInsertPosition();

        int[] nums = new int[] { 1, 3, 5, 6 };
        var expected = 2;

        assertEquals(expected, search.searchInsert(nums, 5));
    }

    @Test
    void searchPositionFoundAtEnd() {
        SearchInsertPosition  search = new SearchInsertPosition();

        int[] nums = new int[] { 1, 3, 5, 6 };
        var expected = 3;

        assertEquals(expected, search.searchInsert(nums, 6));
    }

    @Test
    void searchPositionFoundAtBeginning() {
        SearchInsertPosition  search = new SearchInsertPosition();

        int[] nums = new int[] { 1, 3, 5, 6 };
        var expected = 0;

        assertEquals(expected, search.searchInsert(nums, 1));
    }

    @Test
    void searchPositionNotFoundInsertMiddle() {
        SearchInsertPosition  search = new SearchInsertPosition();

        int[] nums = new int[] { 1, 3, 5, 6 };
        var expected = 1;

        assertEquals(expected, search.searchInsert(nums, 2));
    }

    @Test
    void searchPositionNotFoundInsertEnd() {
        SearchInsertPosition  search = new SearchInsertPosition();

        int[] nums = new int[] { 1, 3, 5, 6 };
        var expected = 4;

        assertEquals(expected, search.searchInsert(nums, 7));
    }

    @Test
    void searchPositionNotFoundInsertBeginning() {
        SearchInsertPosition  search = new SearchInsertPosition();

        int[] nums = new int[] { 1, 3, 5, 6 };
        var expected = 0;

        assertEquals(expected, search.searchInsert(nums, 0));
    }

    @Test
    void searchInsertPositionNoNumsTest() {
        SearchInsertPosition  search = new SearchInsertPosition();

        int[] nums = new int[] {};
        var expected = 0;

        assertEquals(expected, search.searchInsert(nums, 5));

    }

    @Test
    void searchInsertPositionNullNumsTest() {
        SearchInsertPosition  search = new SearchInsertPosition();

        assertThrows(IllegalArgumentException.class, () -> search.searchInsert(null, 5));

    }
}