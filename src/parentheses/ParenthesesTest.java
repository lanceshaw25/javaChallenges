package parentheses;

import anagram.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesTest {

//    TwoSum testClass = new TwoSum();
    Parentheses testClass = new Parentheses();

    @Test
    void isValidParentheses() {

        assertTrue(testClass.isValid("()"));
        assertFalse(testClass.isValid("())"));
        assertFalse(testClass.isValid("("));
    }

    @Test
    void isValidMixedInline() {
        assertTrue(testClass.isValid("()[]{}"));
    }

    @Test
    void isValidParenthesesMixedUnMatched() {
        assertFalse(testClass.isValid("(]"));
    }

    @Test
    void isValidParenthesesMixedOutOfOrder() {
        assertFalse(testClass.isValid("([)]"));
    }

    @Test
    void isValidParenthesesMixedMatched() {
        assertTrue(testClass.isValid("{[]}"));
    }

    @Test
    void unexpectedCharacter() {
        var ex = assertThrows(IllegalArgumentException.class, () -> {
            testClass.isValid("(a)");
        });

        assertEquals("unexpected character a", ex.getMessage());
    }

}