package org.example;

import java.util.Arrays;

class Solution {
    //given an array of N integers write a function
    // which returns the first non zero postivie integer
    //that does not occur in the array
    public int solutionFromCoPilot(int[] A) {
        int n = A.length;
        boolean[] present = new boolean[n + 1];

        // Mark the integers present in the array
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n) {
                present[A[i]] = true;
            }
        }

        // Find the smallest positive integer not present
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        // If all integers from 1 to n are present, the answer is n+1
        return n + 1;
    }


    public int solutionFromMe(int[] A) {
        int arrayMaxSize = 1_000_000;
        int arrayMinSize = 1;
        int returnMinValue = 1;
        // N less then 100 000 and > = 1  N is an array size
        // each element of the array is between [-1 000 000 and 1 000 000 ]
        int N = A.length;
        if (N == 0) return returnMinValue;
        boolean[] exists = new boolean[arrayMaxSize+1];

        Arrays.stream(A)
                .filter(n -> n >= arrayMinSize && n <= arrayMaxSize)
                .forEach(n -> exists[n] = true);

        for (int m = arrayMinSize; m < arrayMaxSize; m++) {
            if (!exists[m]) {
                return m;
            }
        }
        return N+1;
    }

}