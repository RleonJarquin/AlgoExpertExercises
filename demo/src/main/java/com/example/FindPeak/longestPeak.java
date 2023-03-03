package com.example.FindPeak;

public class longestPeak {

    public static int find_peak(int[] array) {
        int longestPeakLength = 0;
        // From the first element to the 2nd to last element loop through.
        for (int i = 1; i < array.length - 1; i++) {
            // If the current value is a peak execute code
            boolean isPeak = array[i - 1] < array[i] && array[i] > array[i + 1];
            // If the value is a peak value go ahead an execute the code
            if (isPeak) {
                // Index to left of the array
                int leftIdx = i - 2;
                // If the left Index is greater than or equal to 0 and the current element is less than the right elem 
                // decrement to the left
                while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) {
                    leftIdx -= 1;
                }
                int rightIdx = i + 2;
                
                // If the right Index is less than or equal to the max elem and the current element is less than the left element 
                // Increment towards the right
                while (rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]) {
                    rightIdx += 1;
                }

                int currentLength = rightIdx - leftIdx - 1;
                if (currentLength > longestPeakLength) {
                    longestPeakLength = currentLength;
                }
                i = rightIdx - 1;
            }
        }
        return longestPeakLength;
    }

    public static void main(String[] args) {

        int[] input = new int[] { 1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3 };
        int[] fail_case = new int[] { 1, 2, 3, 4, 5, 1 };
        // Expected 6

        System.out.println(find_peak(input));
        System.out.println(find_peak(fail_case));

    }

}
