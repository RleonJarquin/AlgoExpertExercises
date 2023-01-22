package com.example.ThreeSum;

import java.util.*;

class Program {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // O(n^2) | O(n)
        Arrays.sort(array);
        List<Integer[]> triplets = new ArrayList<Integer[]>();

        // Looping through the array if the totalSum is the targetSum input into triplet
        for (int currentNumber = 0; currentNumber < array.length - 2; currentNumber++) {
            int left = currentNumber + 1;
            int right = array.length - 1;

            // While the Left Pointer is less than the right one
            while (left < right) {
                int totalSum = array[currentNumber] + array[left] + array[right];
                // if the total sum is equal to the target then input it and move both pointers
                // together
                if (totalSum == targetSum) {
                    Integer[] newTriplet = { array[currentNumber], array[left], array[right] };
                    triplets.add(newTriplet);
                    left++;
                    right--;
                }
                // If totalSum is less than the target Increment the left
                else if (totalSum < targetSum) {
                    left++;
                }
                // If totalSum is greater than target decrement right
                else if (totalSum > targetSum) {
                    right--;
                }
            }

        }

        return new ArrayList<Integer[]>();
    }

    public static void main(String[] args) {
        List<Integer[]> expected = new ArrayList<Integer[]>();
        expected.add(new Integer[] { -8, 2, 6 });
        expected.add(new Integer[] { -8, 3, 5 });
        expected.add(new Integer[] { -6, 1, 5 });
        //List<Integer[]> output = Program.threeNumberSum(new int[] { 12, 3, 1, 2, -6, 5, -8, 6 }, 0);
        System.out.println(threeNumberSum(new int[] { 12, 3, 1, 2, -6, 5, -8, 6 }, 0));
    }
}
