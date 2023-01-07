package org.example.mymath;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class TestUselessMath {
    @Test
    public void testSlowInverseSquareRoot() {
        double startingValue = 4d;
        double computedValue = UselessMath.slowInverseSqRoot(startingValue);

        assertThat(computedValue, is(greaterThan(1d)));
    }
}
