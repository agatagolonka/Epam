package com.epam.test.automation.java.practice6;


import java.math.BigDecimal;

public class Manager extends Employee {
    private int quantity;
    private BigDecimal bonus;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        this.quantity = clientAmount;
    }

    @Override

    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException();
        }
        else {
            if ((this.quantity > 100)&&(this.quantity<=150)) {
                this.bonus=bonus.add(BigDecimal.valueOf(500));
            }
            else if (this.quantity > 150) {
                this.bonus=bonus.add(BigDecimal.valueOf(1000));
            }
            else{
                this.bonus=bonus;
            }

        }
    }
    @Override
    public BigDecimal getBonus() {
        return this.bonus;
    }
}