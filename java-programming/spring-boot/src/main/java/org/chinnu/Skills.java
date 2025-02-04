package org.chinnu;
import java.util.Arrays;
import java.util.Scanner;
public class Skills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] skills = new String[5];
        System.out.println("Enter name");
        String name = input.next();
        for (int i = 0; i < skills.length; i++) {
            System.out.println("Enter skill name");
            String skillName = input.next();
            skills[i] = skillName;
        }

        System.out.println("Name= " + name );
        System.out.println(Arrays.toString(skills));


    }
}
