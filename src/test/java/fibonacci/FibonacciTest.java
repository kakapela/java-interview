package fibonacci;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    void shouldReturnFirstElementOfFibonacci() {
        // given
        int n = 0;
        // when
        int result = fibonacci.solution(n);
        // then
        assertThat(result).isEqualTo(0);

    }

    @Test
    void shouldReturnSecondElementOfFibonacci() {
        // given
        int n = 1;
        // when
        int result = fibonacci.solution(n);
        // then
        assertThat(result).isEqualTo(1);

    }

    @Test
    void shouldReturnFourthElementOfFibonacci() {
        // given
        int n = 3;
        // when
        int result = fibonacci.solution(n);
        // then
        assertThat(result).isEqualTo(2);

    }
    @ParameterizedTest
    @MethodSource("fibonacciParams")
    void shouldReturnElementsGreaterThanN(int n, int expected) {
        // given
        // when
        int result = fibonacci.solution(n);
        // then
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> fibonacciParams(){

        return Stream.of(
                arguments(3,2),
                arguments(4,3),
                arguments(5,5)
        );

    }

}