package com.example.TwoSum;

import java.util.*;

public class Solution {

    // Given an array of integers nums and an integer target, return indices of the
    // two numbers such that they add up to target.

    // You may assume that each input would have exactly one solution, and you may
    // not use the same element twice.

    // Loop through the array

    public static int[] twoSumSearch(int[] array, int targetSum) {

        HashMap<Integer, Integer> twoSumMap = new HashMap<>();

        // Check if the y is in the hashmap key values otherwise put in the hashmap.
        // If it is return the array with both values

        int[] twoSumArray;

        for (int idx = 0; array.length > idx; idx++) {
            int x = array[idx];
            int y = targetSum - x;
            // If the value in the array of x is in the keyset then you found a compatible pair
            if (twoSumMap.keySet().contains(x)) {
                // Given that the value is x is in the key set search it in the hashmap
                twoSumArray = new int[] { twoSumMap.get(x), x};
                return twoSumArray;
            }
            else{
                twoSumMap.put(y,x);
            }

        }

        return new int [] {};

    }

    public static void main(String[] args) {
        int array[] = { 3, 5, -4, 8, 11, 1, -1, 6};

        int targetNum = 10;

        System.out.print(twoSumSearch(array, targetNum));



    }

}
