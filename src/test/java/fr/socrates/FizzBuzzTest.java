package fr.socrates;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void shouldReturnOneGivenOne() {
        assertThat(fizzBuzz(1)).isEqualTo("1");
    }

    @Test
    public void shouldReturnTwoGivenTwo() {
        assertThat(fizzBuzz(2)).isEqualTo("2");
    }

    private String fizzBuzz(int n) {
        return n == 2 ? "2"
                : "1";
    }
}
