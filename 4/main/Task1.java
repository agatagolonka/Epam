package com.epam.test.automation.java.practice4;

import java.util.Arrays;


public class Task1 {
    private Task1(){
        
    }

    public static boolean isSorted(int[] array, SortOrder order){
        if (array != null) {
            int[] tmpArray = array.clone();
            Arrays.sort(tmpArray);
            if (order == SortOrder.ASC) {

                for (int i = 0; i < array.length; i++) {
                    if (array[i] != tmpArray[i]) {
                        return false;
                    }
                }
                return true;
            }

            if (order == SortOrder.DESC) {
         
                for (int i = 0; i < array.length; i++) {
                    if (array[i] != tmpArray[tmpArray.length - i - 1]) {
                        return false;
                    }
                }
                return true;
            }
        } 
            throw new IllegalArgumentException();
        

    }
}
