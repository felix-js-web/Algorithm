package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringAlternatelyTest {

    private MergeStringAlternately mergeStringAlternately;

    @BeforeEach
    void setUp() {
        mergeStringAlternately = new MergeStringAlternately();
    }

    @Test
    void mergeAlternately_EqualLengthStrings_ReturnsMergedString() {
        assertEquals("a1b2c3", mergeStringAlternately.mergeAlternately("abc", "123"));
    }

    @Test
    void mergeAlternately_FirstStringLonger_ReturnsMergedString() {
        assertEquals("a1b2c3d ", mergeStringAlternately.mergeAlternately("abcd", "123"));
    }

    @Test
    void mergeAlternately_SecondStringLonger_ReturnsMergedString() {
        assertEquals("a1b2c3 4", mergeStringAlternately.mergeAlternately("abc", "1234"));
    }

    @Test
    void mergeAlternately_OneEmptyString_ReturnsOtherString() {
        assertEquals("a b c ", mergeStringAlternately.mergeAlternately("abc", ""));
    }

    @Test
    void mergeAlternately_BothEmptyStrings_ReturnsEmptyString() {
        assertEquals("", mergeStringAlternately.mergeAlternately("", ""));
    }

    @Test
    void mergeAlternately_SpecialCharactersInStrings_ReturnsMergedString() {
        assertEquals("@1#2$3", mergeStringAlternately.mergeAlternately("@#$", "123"));
    }
}