package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapTest {

    private final AnotherBinaryGap binaryGap = new AnotherBinaryGap();

    @Test
    void findsMaximumGapInBinaryRepresentation() {
        assertEquals(2, binaryGap.solution(9)); // Binary of 9 is 1001, maximum gap is 2
    }

    @Test
    void returnsNegativeOneForSingleOneInBinary() {
        assertEquals(0, binaryGap.solution(16)); // Binary of 16 is 10000, only one 1 present
    }

    @Test
    void handlesZeroCorrectly() {
        assertEquals(0, binaryGap.solution(0)); // Binary of 0 has no 1s
    }

    @Test
    void handlesNoGapScenario() {
        assertEquals(0, binaryGap.solution(3)); // Binary of 3 is 11, no gap present
    }

    @Test
    void handlesMaximumIntegerValue() {
        assertEquals(0, binaryGap.solution(Integer.MAX_VALUE)); // Binary representation ends with a 1, no gap after last 1
    }
}