package armstrong_number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArmstrongNumberTest {

    @Test
    void shouldFindArmstrongNumber() {
        // given
        int n = 153;
        // when
        boolean result = ArmstrongNumber.isArmstrongNumber(n);
        // then
        assertThat(result).isTrue();
    }

    @Test
    void shouldNotFindArmstrongNumber() {
        // given
        int n = 154;
        // when
        boolean result = ArmstrongNumber.isArmstrongNumber(n);
        // then
        assertThat(result).isFalse();
    }
}