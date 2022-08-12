package codility.lesson_5.passing_cars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void shouldReturnCorrectNumberOfPairs() {
        // given
        int[] A = {0, 1, 0, 1, 1};
        // when
        int result = solution.solution(A);
        // then
        Assertions.assertThat(result).isEqualTo(5);
    }


    @ParameterizedTest
    @MethodSource("intArrayProvider")
    void shouldReturnZeroPairs(int[] A) {
        // given
//        int[] A = {1,1,1,1,1};
        // when
        int result = solution.solution(A);
        // then
        Assertions.assertThat(result).isEqualTo(0);
    }

    static Stream<Arguments> intArrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 1, 1}),
                Arguments.of(new int[]{0, 0, 0, 0, 0})
        );
    }

    @Test
    void shouldReturnCorrectNumberOfPairsForSecondSolution() {
        // given
        int[] A = {0, 1, 0, 1, 1};
        // when
        int result = solution.solution2(A);
        // then
        Assertions.assertThat(result).isEqualTo(5);
    }

    @ParameterizedTest
    @MethodSource("intArrayProvider")
    void shouldReturnZeroPairsForSecondSolution(int[] A) {
        // given
//        int[] A = {1,1,1,1,1};
        // when
        int result = solution.solution2(A);
        // then
        Assertions.assertThat(result).isEqualTo(0);
    }
}