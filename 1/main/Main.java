package com.epam.test.automation.java.practice1;
import java.util.Arrays;


final class Main {
    
    private Main() {
        super();
    }

    
    public static int task1(int n) {
        
        int result;
        if (n>0){
            result = n*n;
        }
        else if (n<0){
            result = Math.abs(n);
            
        }
        else{
            result = 0;
        }
    
        return result;
    }

    public static int task2(int n) {
        int result = 0;
        
        if (n>100 && n<999) {
            
            int third = n % 10;
            int second = (n % 100 - n % 10) / 10;
            int first = (n - n % 100) / 100;
            int[] tab = new int[]{first, second, third};
            Arrays.sort(tab);
            result = tab[2] * 100 + tab[1] * 10 + tab[0];
            
        }
        else{
            System.out.println("Enter a three-digit number");
            
        }
        return result;
        
    }
    
}

