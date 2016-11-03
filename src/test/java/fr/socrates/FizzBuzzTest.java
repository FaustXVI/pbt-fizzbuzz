package fr.socrates;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.tngtech.java.junit.dataprovider.DataProviders.$;
import static com.tngtech.java.junit.dataprovider.DataProviders.$$;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataProviderRunner.class)
public class FizzBuzzTest {

    @DataProvider(format = "%m%p[0]")
    public static Object[][] nominals() {
        return $$(
                $(1),
                $(2),
                $(4),
                $(7),
                $(8),
                $(101)
        );
    }

    @Test
    @UseDataProvider("nominals")
    public void shouldEchoInputGiven(Integer n) {
        assertThat(fizzBuzz(n)).isEqualTo(n.toString());
    }

    @DataProvider(format = "%m%p[0]")
    public static Object[][] multiplesOf3() {
        return $$(
                $(3),
                $(6),
                $(9),
                $(12),
                $(18),
                $(303)
        );
    }

    @Test
    @UseDataProvider("multiplesOf3")
    public void shouldFizzOn(Integer n) {
        assertThat(fizzBuzz(n)).isEqualTo("Fizz");
    }

    @DataProvider(format = "%m%p[0]")
    public static Object[][] multiplesOf5() {
        return $$(
                $(5),
                $(10),
                $(20),
                $(25),
                $(35),
                $(100)
        );
    }

    @Test
    @UseDataProvider("multiplesOf5")
    public void shouldBuzzOn(Integer n) {
        assertThat(fizzBuzz(n)).isEqualTo("Buzz");
    }

    @Test
    public void shouldFizzBuzzOnFifteen() {
        assertThat(fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void shouldFizzBuzzOnThirty() {
        assertThat(fizzBuzz(30)).isEqualTo("FizzBuzz");
    }

    @Test
    public void shouldFizzBuzzOnFourtyFive() {
        assertThat(fizzBuzz(45)).isEqualTo("FizzBuzz");
    }

    private String fizzBuzz(int n) {
        return n % 15 == 0 ? "FizzBuzz"
                : n % 5 == 0 ? "Buzz"
                : n % 3 == 0 ? "Fizz"
                : String.valueOf(n);
    }
}
