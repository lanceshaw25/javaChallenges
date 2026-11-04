package longestsubstring;

import utility.Debug;

import java.util.HashSet;

public class LongestSubstringV2 {

    /**
     * Given a string s, return the length of the longest substring that contains no repeated characters.
     *
     * @param s
     * @return
     *
     * use sliding window to achieve O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        Debug.log("checking the string %s%n",s);
        if (s == null || s.length() == 0) {
            return 0;
        }

        var longest = 0;
        int start = 0;
        var uniqueChars = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (uniqueChars.contains(ch)) {
                // if ch is in uniqueChars, a repeating char is found, and we must shrink the set
                // save longest
                Debug.log("letter %c is repeated%n", ch);
                Debug.log("unique substring length=%d%n", uniqueChars.size());
                if (uniqueChars.size() > longest) {
                    longest = uniqueChars.size();
                    Debug.log("longest substring updated to length=%d%n", longest);
                }

                // backout characters from uniqueChars
                while (start <= i && ch != s.charAt(start)) {
                    Debug.log("removing from uniqueChars char=%c at position=%d%n", s.charAt(start), start);
                    uniqueChars.remove(s.charAt(start));
                    start++;
                }
                start++;  // one more for the matching character....
                Debug.log("uniqueChars should be clean now with length=%d, and start=%d%n%n", uniqueChars.size(), start);
            } else {
                Debug.log("adding letter from %d, letter=%c%n", i, ch);
                uniqueChars.add(ch);
                if (uniqueChars.size() > longest) {
                    longest = uniqueChars.size();
                    Debug.log("longest substring updated to length=%d%n", longest);
                }
            }
        }

        return longest;

    }
}
