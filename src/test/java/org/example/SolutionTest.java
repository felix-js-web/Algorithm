package org.example;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findsMissingPositiveInMixedArray() {
        assertEquals(5, solution.solutionFromMe(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    void returnsOneForAllNegativeArray() {
        assertEquals(1, solution.solutionFromMe(new int[]{-1, -3, -6, -4, -1, -2}));
    }

    @Test
    void returnsNextPositiveForSequentialArray() {
        assertEquals(4, solution.solutionFromMe(new int[]{1, 2, 3}));
    }

    @Test
    void handlesLargeArray() {
        int[] largeArray = new int[100000];
        for (int i = 0; i < 99999; i++) {
            largeArray[i] = i + 1;
        }
        largeArray[99999] = 100001;
        assertEquals(100000, solution.solutionFromMe(largeArray));
    }

    @Test
    void returnsOneForEmptyArray() {
        assertEquals(1, solution.solutionFromMe(new int[]{}));
    }

    @Test
    void handlesSingleElementArrayMissingPositive() {
        assertEquals(1, solution.solutionFromMe(new int[]{0}));
    }

    @Test
    void handlesSingleElementArrayWithPositive() {
        assertEquals(2, solution.solutionFromMe(new int[]{1}));
    }
}
