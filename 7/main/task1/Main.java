package com.epam.test.automation.java.practice10.task1;

class Main {

    public static void main(String[] args) {
        Florist florist = new Florist();
        for (Month month : Month.values()) {
            System.out.format("Roses in %s: %.2f PLN",
                    month, florist.calculatePrice(5.0, month));
        }
    }

}