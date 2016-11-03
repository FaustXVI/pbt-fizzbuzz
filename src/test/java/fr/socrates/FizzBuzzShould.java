package fr.socrates;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.tngtech.java.junit.dataprovider.DataProviders.$;
import static com.tngtech.java.junit.dataprovider.DataProviders.$$;
import static fr.socrates.FizzBuzz.fizzBuzz;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(DataProviderRunner.class)
public class FizzBuzzShould {

    @Test
    @UseDataProvider("multiplesOf15")
    public void fizzBuzzOn(Integer aMultipleOf15) {
        assertThat(fizzBuzz(aMultipleOf15)).isEqualTo("FizzBuzz");
    }

    @Test
    @UseDataProvider("multiplesOf5")
    public void buzzOn(Integer aMultipleOf5) {
        assertThat(fizzBuzz(aMultipleOf5)).isEqualTo("Buzz");
    }

    @Test
    @UseDataProvider("multiplesOf3")
    public void fizzOn(Integer aMultipleOf3) {
        assertThat(fizzBuzz(aMultipleOf3)).isEqualTo("Fizz");
    }

    @Test
    @UseDataProvider("nominals")
    public void echoInputGiven(Integer otherInput) {
        assertThat(fizzBuzz(otherInput)).isEqualTo(otherInput.toString());
    }

    @DataProvider(format = "%m%p[0]")
    public static Object[][] multiplesOf15() {
        return $$(
                $(15),
                $(30),
                $(45),
                $(60),
                $(75),
                $(150)
        );
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

}
