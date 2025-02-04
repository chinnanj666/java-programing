package org.chinnu;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Enter option 01\\02\\03\\q");
        String option = new Scanner(System.in).next();
        do{
            if (option.equals("1")){
                System.out.println("User entered 1");
            }else if (option.equals("2")){
                System.out.println("User entered 2");
            }else if (option.equals("3")){
                System.out.println("User entered 3");
            } else if (option.equals("q")) {
                System.exit(0);
            }
            option = new Scanner(System.in).next();
        }while(!option.equals("q"));
    }
}
