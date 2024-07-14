package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDMyAlgoTest {

    @Test
    void gcd_withPositiveNumbers_returnsCorrectGCD() {
        assertEquals(6, GCDMyAlgo.gcd(24, 54), "GCD of 54 and 24 should be 6");
    }


    @Test
    void gcd_withFirstNumberZero_returnsSecondNumber() {
        assertEquals(5, GCDMyAlgo.gcd(0, 5), "GCD of 0 and 5 should be 5");
    }

    @Test
    void gcd_withSecondNumberZero_returnsFirstNumber() {
        assertEquals(10, GCDMyAlgo.gcd(10, 0), "GCD of 10 and 0 should be 10");
    }

    @Test
    void gcd_withBothNumbersZero_returnsZero() {
        assertEquals(0, GCDMyAlgo.gcd(0, 0), "GCD of 0 and 0 should be 0");
    }

    @Test
    void gcd_withEqualNumbers_returnsSameNumber() {
        assertEquals(25, GCDMyAlgo.gcd(25, 25), "GCD of 25 and 25 should be 25");
    }

    @Test
    void gcd_orderOfParametersDoesNotMatter() {
        assertEquals(GCD.gcd(24, 54), GCDMyAlgo.gcd(54, 24), "GCD should be the same regardless of the order of parameters");
    }
}