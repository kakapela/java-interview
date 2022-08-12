package power;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

class PowerTest {
    private Power power = new Power();

    @ParameterizedTest
    @MethodSource("params")
    void shouldReturnCorrectPowerOfNumber(int x, int y, int result) {
        // given
        // when
        int res = power.power(x, y);
        // then
        assertThat(res).isEqualTo(result);
    }

    static Stream<Arguments> params() {
        return Stream.of(
                of(1, 0, 1),
                of(0, 0, 0),
                of(10, 0, 1),
                of(2, 0, 1),
                of(3, 2, 9),
                of(2, 3, 8)
        );
    }
}