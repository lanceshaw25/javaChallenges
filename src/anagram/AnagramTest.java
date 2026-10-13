package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramTest {

//    TwoSum testClass = new TwoSum();
    Anagram testClass = new Anagram();

    @Test
    void isValidAnagram() {
        assertTrue(testClass.isAnagram("anagram", "nagaram"));
    }

    @Test
    void invalidAnagram() {
        assertFalse(testClass.isAnagram("rat", "car"));

    }

    @Test
    void lettersMatchButDifferentCounts() {
        assertFalse(testClass.isAnagram("aacc", "ccac"));
    }
}