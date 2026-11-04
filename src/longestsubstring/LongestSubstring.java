package longestsubstring;

import utility.Debug;

import java.util.HashSet;

public class LongestSubstring {

    /**
     * Given a string s, return the length of the longest substring that contains no repeated characters.
     *
     * @param s
     * @return
     *
     * this version works, but is O(n^2)  :-(
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        var longest = 0;
        for (int i = 0; i < (s.length() - longest); i++) {
            // find the length before repeats starting at i
            // break out of look ahead when we find a repeating character
            Debug.log("%nchecking position %d, letter=%c%n", i, s.charAt(i));
            var uniqueChars = new HashSet<Character>();
            for (int j = i; j <= s.length() - 1; j++) {
                char ch = s.charAt(j);
                if (uniqueChars.contains(ch)) {
                    break;
                }
                Debug.log("adding letter from %d, letter=%c%n", j, ch);
                uniqueChars.add(ch);
            }
            Debug.log("unique substring length=%d%n", uniqueChars.size());
            if (uniqueChars.size() > longest) {
                longest = uniqueChars.size();
            }
        }

        return longest;

    }
}
