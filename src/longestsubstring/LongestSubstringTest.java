package longestsubstring;

import org.junit.jupiter.api.Test;
import utility.Debug;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        var debug= Debug.ENABLED;
        Debug.ENABLED = true;

        var test = new LongestSubstring();
        String s = "abcabcbb";
        int expected = 3;
        assertEquals(expected, test.lengthOfLongestSubstring(s));

        Debug.ENABLED = debug;
    }

    @Test
    void lengthOfLongestSubstringAllOneCharacter() {
        var debug= Debug.ENABLED;
        Debug.ENABLED = true;

        var test = new LongestSubstring();
        String s = "bbbbb";
        int expected = 1;
        assertEquals(expected, test.lengthOfLongestSubstring(s));

        Debug.ENABLED = debug;
    }

    @Test
    void lengthOfLongestSubstringRepeatedAgainLater() {
        var debug= Debug.ENABLED;
        Debug.ENABLED = true;

        var test = new LongestSubstring();
        String s = "pwwkew";
        int expected = 3;
        assertEquals(expected, test.lengthOfLongestSubstring(s));

        Debug.ENABLED = debug;
    }

    @Test
    void lengthOfLongestSubstringAtEnd() {
        var debug= Debug.ENABLED;
        Debug.ENABLED = true;

        var test = new LongestSubstring();
        String s = "pwwkewabcdef";
        int expected = 7;
        assertEquals(expected, test.lengthOfLongestSubstring(s));

        Debug.ENABLED = debug;
    }

    @Test
    void lengthOfLongestSubstringEmptyString() {
        var debug= Debug.ENABLED;
        Debug.ENABLED = true;

        var test = new LongestSubstring();
        String s = "";
        int expected = 0;
        assertEquals(expected, test.lengthOfLongestSubstring(s));

        Debug.ENABLED = debug;
    }
}