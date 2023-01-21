package com.example.ValidateSubSequence;

import java.util.*;

class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int seqIdx = 0;

        // Loop through the array and if the value is in the array traverse through the
        // sequence by one
        for (int x = 0; x < array.size(); x++) {
            if (array.get(x) == sequence.get(seqIdx)) {
                seqIdx++;
            }
            if (seqIdx == sequence.size()) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);

        System.out.println(isValidSubsequence(array, sequence));

    }

}
