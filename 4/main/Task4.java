package com.epam.test.automation.java.practice4;

public class Task4 {
    private Task4(){
        
    }


    public static double sumGeometricElements(int a1, double t, int alim){
            double result = a1;
        double a = a1;
       if (t > 0 && t < 1) {
            if ((a1 > alim && a1>1)&&(a1<20000)) {
                while ((a*t) > alim) {
                    a = a * t;
                    result = result + a;
                    System.out.println("a: " + a);
                    System.out.println("result :" + result);

                }
                return result;
            }
            else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

}