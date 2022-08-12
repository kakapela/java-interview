package factorial;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FactorialTest {

    private Factorial factorial = new Factorial();

    @ParameterizedTest
    @MethodSource("params")
    void shouldFindFactorialOfANumber(int n, int res) {
        // given
        // when
        int result = factorial.factorial(n);
        // then
        assertThat(result).isEqualTo(res);

    }

    static Stream<Arguments> params() {
        return Stream.of(
                arguments(0, 1),
                arguments(1, 1),
                arguments(2, 2),
                arguments(3, 6),
                arguments(4, 24)
        );

    }
}