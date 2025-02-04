package org.chinnu;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String [] proLangs = {"c", "c++","Python", "The Beast Java", "Hot GoLang"};
        for (String stringIndex:proLangs){
            System.out.println(stringIndex);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i + " " + j + "");
            }
            System.out.println();  // newline of each i in j
        }

    }
    }

