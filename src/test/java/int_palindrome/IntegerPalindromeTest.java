package int_palindrome;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class IntegerPalindromeTest {

    private IntegerPalindrome integerPalindrome = new IntegerPalindrome();

    @Test
    void shouldFindPalindrome() {
        // given
        int n = 101;
        // when
        boolean result = integerPalindrome.isPalindrome(n);
        // then
        Assertions.assertThat(result).isTrue();

    }


    @Test
    void shouldNotFindPalindrome() {
        // given
        int n = 101123;
        // when
        boolean result = integerPalindrome.isPalindrome(n);
        // then
        Assertions.assertThat(result).isFalse();

    }
}