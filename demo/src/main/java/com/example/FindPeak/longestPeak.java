package com.example.FindPeak;

public class longestPeak {

    public static int find_peak(int[] array) {
        int longestPeakLength = 0;

        for (int i = 1; i < array.length - 1; i++) {
            // If the current value is a peak execute code
            boolean isPeak = array[i - 1] < array[i] && array[i] > array[i + 1];
            if (isPeak) {
            }
            // Index to left of the array
            int leftIdx = i - 2;
            while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) {
                leftIdx -= 1;
            }
            int rightIdx = i + 2;
            while (rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]) {
                rightIdx += 1;
            }

            int currentLength = rightIdx - leftIdx - 1;
            if (currentLength > longestPeakLength) {
                longestPeakLength = currentLength;
            }
            i = rightIdx;
        }
        return longestPeakLength;
    }

    public static void main(String[] args) {

        int[] input = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};

        System.out.println(find_peak(input));

    }

}
