package bubble_sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class BubbleSortTest {

    @Test
    void shouldSortArray() {
        // given
        int[] A = {3,2,1,6,5,4};
        // when
        BubbleSort.sort(A);
        // then
        assertThat(A[0])
                .isEqualTo(1);

        assertThat(A[1])
                .isEqualTo(2);
    }
}