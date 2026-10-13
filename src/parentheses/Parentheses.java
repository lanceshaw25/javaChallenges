package parentheses;


import java.util.ArrayDeque;

/**
 * Given a string s containing only the characters '(', ')', '{', '}', '[', and ']', determine whether the input string is valid.
 *
 * A string is valid if:
 *
 * Every opening bracket is closed by the same type of bracket.
 * Opening brackets are closed in the correct order.
 * Every closing bracket has a corresponding opening bracket.
 */
public class Parentheses {

    /**
     *      Determines whether a string of brackets is valid.
     *      the same type of bracket, in the correct order.
     *
     *      @param s the string containing brackets to validate
     *      @return {@code true} if the brackets are valid; {@code false} otherwise
     */
    public boolean isValid(String s) {
        var stack = new ArrayDeque<Character>();

        for (char c : s.toCharArray()) {
            // push opening markers to stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                // stack empty means there is no matching opening marker
                if (stack.isEmpty()) return false;
                // closing markers must match with the popped marker
                var shouldMatch = stack.pop();
                if (c == ')' && shouldMatch != '(') return false;
                if (c == '}' && shouldMatch != '{') return false;
                if (c == ']' && shouldMatch != '[') return false;

            } else {
                throw new IllegalArgumentException("unexpected character " + c);
            }
        };

        return stack.isEmpty();
    }
}
