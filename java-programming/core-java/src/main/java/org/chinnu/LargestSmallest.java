package org.chinnu;

import java.util.Arrays;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {15, 42, 7, 89, 23, 1000};
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Largest number: " + max);
        System.out.println("The Smallest number: " + min);
    }
}
