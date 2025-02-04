package org.chinnu;

public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 2};
        int target = 2;
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println(count + " time appeared the number " + target);
    }
}

