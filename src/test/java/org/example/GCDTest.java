package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GCDTest {

    @Test
    void gcd_withPositiveNumbers_returnsCorrectGCD() {
        assertEquals(6, GCD.gcd(24, 54), "GCD of 54 and 24 should be 6");
    }

    @Test
    void gcd_withFirstNumberZero_returnsSecondNumber() {
        assertEquals(5, GCD.gcd(0, 5), "GCD of 0 and 5 should be 5");
    }

    @Test
    void gcd_withSecondNumberZero_returnsFirstNumber() {
        assertEquals(10, GCD.gcd(10, 0), "GCD of 10 and 0 should be 10");
    }

    @Test
    void gcd_withBothNumbersZero_returnsZero() {
        assertEquals(0, GCD.gcd(0, 0), "GCD of 0 and 0 should be 0");
    }

    @Test
    void gcd_withEqualNumbers_returnsSameNumber() {
        assertEquals(25, GCD.gcd(25, 25), "GCD of 25 and 25 should be 25");
    }

    @Test
    void gcd_orderOfParametersDoesNotMatter() {
        assertEquals(GCD.gcd(24, 54), GCD.gcd(54, 24), "GCD should be the same regardless of the order of parameters");
    }
}