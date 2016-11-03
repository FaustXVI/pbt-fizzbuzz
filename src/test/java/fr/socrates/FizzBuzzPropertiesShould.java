package fr.socrates;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;


import static fr.socrates.FizzBuzz.fizzBuzz;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assume.assumeTrue;

@RunWith(JUnitQuickcheck.class)
public class FizzBuzzPropertiesShould {

    @Property
    public void containsFizzForAnyMultipleOf3(int aMultipleOf3) {
        assumeTrue(aMultipleOf3 % 3 == 0);
        assertThat(fizzBuzz(aMultipleOf3)).contains("Fizz");
    }

}
