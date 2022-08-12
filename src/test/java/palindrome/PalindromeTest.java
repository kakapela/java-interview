package palindrome;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PalindromeTest {


    @ParameterizedTest
    @MethodSource("params")
    void shouldCheckIfItsPalindrome(String string, boolean result) {
        // given
        // when
        boolean res = Palindrome.isPalindrome(string);
        // then
        Assertions.assertThat(res).isEqualTo(result);
    }

    @ParameterizedTest
    @MethodSource("params")
    void shouldCheckIfItsPalindrome2(String string, boolean result) {
        // given
        // when
        boolean res = Palindrome.isPalindrome2(string);
        // then
        Assertions.assertThat(res).isEqualTo(result);
    }

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.arguments("kacper", false),
                Arguments.arguments("bob", true),
                Arguments.arguments("jojo", false),
                Arguments.arguments("joj", true)


        );
    }
}