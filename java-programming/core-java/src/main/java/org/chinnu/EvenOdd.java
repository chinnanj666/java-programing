package org.chinnu;

public class EvenOdd {
      public static void main(String[] args) {
            int[] arr = {10, 25, 30, 47, 56};
            System.out.print("Even numbers: ");
            for (int num : arr) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }

            System.out.println();

            System.out.print("Odd numbers: ");
            for (int num : arr) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }

