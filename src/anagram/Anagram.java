package anagram;

import java.util.HashMap;
import java.util.Map;

/**
 * Today's coding problem: Valid Anagram
 *
 * Easy Strings · Hash Maps
 *
 * Given two strings, s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An anagram is a word or phrase formed by rearranging the letters of another, using every letter exactly the same
 * number of times.
 *
 * Examples
 *
 * Example 1
 *
 * Input:  s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2
 *
 * Input:  s = "rat", t = "car"
 * Output: false
 *
 * Example 3
 *
 * Input:  s = "aacc", t = "ccac"
 * Output: false
 *
 * Notice that the third example is a little tricky: both strings contain the same letters in some sense,
 * but their letter counts differ.
 */
public class Anagram {
    public boolean isAnagram(String s, String t) {

        // bulid maps of characters, and number of occurences
        var mapS = buildMap(s);
        var mapT = buildMap(t);

        // maps should be the same for a valid anagram
        return mapS.equals(mapT);
    }

    /**
     * build a map of the contents of the provided s
     * map will contain the character as key, and the number of occurrences as the value
     * @param s
     * @return map of characters, and the number of occurrences
     */
    private Map<Character, Integer> buildMap(String s) {
        var map = new HashMap<Character, Integer>();

        s.chars()
            .mapToObj(i -> (char) i)
            .forEach(c -> {
                map.merge(c, 1, Integer::sum);
            });
        
        return map;
    }
}
