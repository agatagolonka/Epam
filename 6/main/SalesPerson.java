package com.epam.test.automation.java.practice6;


import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private int percent;
    private BigDecimal bonus;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }


    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException();
        } else {

            if ((this.percent > 100)&&(this.percent<=200)) {
                this.bonus=bonus.multiply(BigDecimal.valueOf(2));

                this.bonus=bonus.multiply(BigDecimal.valueOf(2));
            }
            else if (this.percent > 200) {
                this.bonus=bonus.multiply(BigDecimal.valueOf(3));

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
