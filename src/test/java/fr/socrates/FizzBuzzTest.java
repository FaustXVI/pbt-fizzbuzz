package fr.socrates;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void shouldReturnOneGivenOne() {
        assertThat(fizzBuzz(1)).isEqualTo("1");
    }

    private String fizzBuzz(int n) {
        return null;
    }
}
