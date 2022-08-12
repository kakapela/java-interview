package prime_number;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PrimeNumberTest {

    @Test
    void shouldFindPrimeNumber() {
        // given
        int n = 3;
        // when
        boolean result = PrimeNumber.isPrimeNumber(n);
        // then
        assertThat(result).isTrue();

    }

    @Test
    void shouldNotFindPrimeNumber() {
        // given
        int n = 10;
        // when
        boolean result = PrimeNumber.isPrimeNumber(n);
        // then
        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @MethodSource("params")
    void shouldCheckIfPrimeNumber(int n, boolean result) {
        // given
        // when
        boolean res = PrimeNumber.isPrimeNumber(n);
        // then
        assertThat(res).isEqualTo(result);

    }

    static Stream<Arguments> params(){
        return Stream.of(
                arguments(3,true),
                arguments(4,false),
                arguments(5,true),
                arguments(7,true),
                arguments(11,true),
                arguments(12,false)
        );

    }
}