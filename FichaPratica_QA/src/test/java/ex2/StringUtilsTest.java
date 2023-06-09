package ex2;

import org.example.ex2.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void testPalindrome() {
        assertTrue(StringUtils.isPalindrome("ana"));
        assertTrue(StringUtils.isPalindrome("Ana"));
        assertTrue(StringUtils.isPalindrome(""));
    }
}
