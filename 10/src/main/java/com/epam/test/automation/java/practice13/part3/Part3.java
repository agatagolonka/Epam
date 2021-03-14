package com.epam.test.automation.java.practice13.part3;

public class Part3 {

    public static final int THREE = 3;

    public static final int TWO = 2;

    public static final int ONE = 1;

    public static final int NUMBERS = 4;

    public static void main(String[] args) {
        Parking parking = new Parking(NUMBERS);
        System.out.print(parking.arrive(TWO));
        parking.print();
        System.out.println(parking.arrive(THREE));
        parking.print();
        System.out.println(parking.arrive(TWO));
        parking.print();
        System.out.println(parking.arrive(TWO));
        parking.print();
        System.out.println(parking.arrive(TWO));
        parking.print();
        System.out.println(parking.depart(ONE));
        parking.print();
        System.out.println(parking.depart(ONE));
        parking.print();
    }

}
