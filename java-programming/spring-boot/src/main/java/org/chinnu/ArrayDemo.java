package org.chinnu;

import  java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
        public static void main(String[] args) {
            int [] numbers1 = {1,4,6,7,8};
            int [] numbers2 = {1,4,6,7,8};
            String name = "Chinnu";
            System.out.println(name);
            System.out.println(Arrays.toString(numbers1)); // Arraymethod for access or printing Array
        // Basic logic
            int x = 10;
            int y = 10;
            System.out.println(x==y);
            System.out.println(Arrays.equals(numbers1,numbers2));

        }
    }