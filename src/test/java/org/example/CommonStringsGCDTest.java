package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommonStringsGCDTest {

    private final CommonStringsGCD commonStringsGCD = new CommonStringsGCD();

    @Test
    void gcdOfStrings_withIdenticalStrings_returnsSameString() {
        assertEquals("ABC", commonStringsGCD.gcdOfStrings("ABC", "ABC"));
    }

    @Test
    void gcdOfStrings_withNoCommonPrefix_returnsEmptyString() {
        assertEquals("", commonStringsGCD.gcdOfStrings("ABC", "DEF"));
    }

    @Test
    void gcdOfStrings_withNoCommonPrefix_returnsEmptyStringLeet() {
        assertEquals("", commonStringsGCD.gcdOfStrings("LEET", "CODE"));
    }

    @Test
    void gcdOfStrings_withPartialMatch_returnsCorrectGCD() {
        assertEquals("AB", commonStringsGCD.gcdOfStrings("ABAB", "AB"));
    }

    @Test
    void gcdOfStrings_withOneStringEmpty_returnsEmptyString() {
        assertEquals("", commonStringsGCD.gcdOfStrings("", "ABC"));
    }

    @Test
    void gcdOfStrings_withBothStringsEmpty_returnsEmptyString() {
        assertEquals("", commonStringsGCD.gcdOfStrings("", ""));
    }

    @Test
    void gcdOfStrings_withRepeatingPattern_returnsPattern() {
        assertEquals("AB", commonStringsGCD.gcdOfStrings("ABABAB", "ABAB"));
    }

    @Test
    void gcdOfStrings_withNonRepeatingPattern_returnsEmptyString() {
        assertEquals("", commonStringsGCD.gcdOfStrings("ABCABC", "ABDABD"));
    }

    @Test
    void gcdOfStrings_withSubStringNotAtStart_returnsEmptyString() {
        assertEquals("", commonStringsGCD.gcdOfStrings("ABC", "CABC"));
    }
}