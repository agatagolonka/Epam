package com.epam.test.automation.java.practice13.part4;

public class Part4 {

    public static void main(String[] args) {
        Range range = new Range(2, 9);
        for (Integer i : range) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        range = new Range(2, 9, true);

        for (Integer i : range) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

}
