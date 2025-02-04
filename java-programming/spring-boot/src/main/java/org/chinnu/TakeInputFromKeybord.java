package org.chinnu;

import java.util.Scanner;

public class TakeInputFromKeybord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        String name  = input.next();
        System.out.println("Enter the age");
        int age = input.nextInt();
        System.out.println("Name=" + name +  "Age=" + age);


    }
}
