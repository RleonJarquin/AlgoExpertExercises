package com.example.TwoSum;

import java.util.*;

public class Solution {

    // Given an array of integers nums and an integer target, return indices of the
    // two numbers such that they add up to target.

    // You may assume that each input would have exactly one solution, and you may
    // not use the same element twice.

    // Loop through the array

    public static int[] twoSumSearch(int[] array, int targetSum) {

        HashMap<Integer, Integer> twoSumSearch = new HashMap<>();

        // Check if the y is in the hashmap otherwise put in the hashmap.
        // If it is return the array with both values

        int[] twoSumArray;

        for (int x = 0; array.length > x; x++) {
            int y = 10 - array[x];
            if (twoSumSearch.keySet().contains(y)) {
                twoSumArray = new int[] { array[x], y };
                return twoSumArray;
            }
            else{
                twoSumSearch.put(y,array[x]);
            }

        }

        return new int [] {};

    }

    public static void main(String[] args) {
        int array[] = { 2, 7, 11, 15 };

        int targetNum = 9;

        

    }

}
