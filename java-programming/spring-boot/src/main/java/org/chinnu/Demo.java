package org.chinnu;

public class Demo {
    public static void main(String[] args) {
        int []numbers = {1,3,4,5,6,7};
        boolean isFiveAvailable= false;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Invoked"+i);
            if(numbers[i]==4){
                isFiveAvailable=true;
                break;

            }
        }
        System.out.println(isFiveAvailable);
    }
}
