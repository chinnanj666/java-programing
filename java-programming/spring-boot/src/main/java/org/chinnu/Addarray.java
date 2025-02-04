package org.chinnu;

import java.beans.PropertyEditorSupport;

public class Addarray {
    public static void main(String[] args) {

        int[] myarray = {10, 20, 30, 40};
        int sum = 0;
        int lengthofArray = myarray.length;
        for (int arraysum :myarray){
          sum += arraysum ;
        }
        System.out.println(sum / lengthofArray);
    }
}
