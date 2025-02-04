package org.chinnu;

public class CopyTheNumberToNew {
        public static void main(String[] args) {
            int[] arr = {15, 42, 7, 89, 23};
            int[] newArr = arr.clone();
            System.out.println("The New  copied array is  ");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }
    }
