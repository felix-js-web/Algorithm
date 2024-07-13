package org.example;

public class AnotherBinaryGap {


    //Given a number n, the task is to find the maximum 0’s between two immediate 1’s in binary representation
    // of given n. Return -1 if binary representation contains less than two 1’s.
    public int solution(int n) {
        // convert the number to binary string
        String binary = Integer.toBinaryString(n);
        // initialize the result
        int result = 0;
        // initialize the counter
        int counter = 0;
        // iterate through the binary representation
        for (int i = 0; i < binary.length(); i++) {
            // if the current character is 0
            if (binary.charAt(i) == '0') {
                // increment the counter
                counter++;
            }
            // if the current character is 1
            else {
                // set the result to the maximum of result and counter
                result = Math.max(result, counter);
                // reset the counter
                counter = 0;
            }
        }
        // return the result
        return result;
    }

}
