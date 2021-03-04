package com.epam.test.automation.java.practice4;

public class Task3 {
    private Task3(){
        
    }


    public static int multiArithmeticElements(int a1, int t, int n){
      if (n>0) {
          int result=a1;
        int a=a1;
        for(int i=0;i<n-1;i++){
            a=oneElement(a,t);
            result=result*a;
        }
        return result;
      }
        throw new IllegalArgumentException();
    }

    private static int oneElement(int a, int t){
        return a+t;
    }
}
