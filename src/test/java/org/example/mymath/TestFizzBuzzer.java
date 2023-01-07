package org.example.mymath;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestFizzBuzzer {
    @Test
    public void testFizzBuzz10() {
        int upperBound = 16;
        String expectedString = "blah";
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        String actualString = fizzBuzzer.fizzBuzzer(upperBound);

        assertThat(actualString, is(expectedString));
    }
}
