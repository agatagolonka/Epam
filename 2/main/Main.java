package com.epam.test.automation.java.practice2;

final class Main {
    
    private Main() {
        super();
    }


    public static int task1(int value) {
        int result = 0;

        if(value <= 0) {
            throw new IllegalArgumentException();
        }
        while (value > 0) {
            int oneDigit = value % 10;

            if (oneDigit % 2 != 0) {
                result = result + oneDigit;
            }
            value = value / 10;
        }

        return result;
    }

    
    public static int task2(int value) {
        
         if((value <= 0)||(value > 2147483647)) {
            throw new IllegalArgumentException();
        }


        int result = 0;
        String binary = Integer.toBinaryString(value);
        System.out.println(binary.length());

        for(int i=0;i<binary.length();i++) {

            if (binary.charAt(i) == '1') {
                System.out.println(binary.charAt(i));
                result = result + 1;
            }
        }



        return result;
    }

    
    public static int task3(int value) {
        
        if(value <= 0) {
            throw new IllegalArgumentException();
        }
        int result = 0;
        
        if(value == 1) {
            return 1;
        }

        while (value > 1) {
            result = result + fibonacci(value - 1);
            --value;
        }
        return result;
    }
    
    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
