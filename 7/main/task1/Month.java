package com.epam.test.automation.java.practice10.task1;

enum Month {

    JANUARY(0.5),
    FEBRUARY(2),
    MARCH(1.5),
    APRIL(1),
    MAY(2),
    JUNE(2),
    JULY(1),
    AUGUST(1),
    SEPTEMBER(1),
    OCTOBER(0.5),
    NOVEMBER(3),
    DECEMBER(1),
    ;

    double multiplier;

    private Month(double howManyMulti){
        multiplier=howManyMulti;
    }

    double calculate(double price) {
        return price*multiplier;
    }

}