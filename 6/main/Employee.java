package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public abstract class Employee {
    private final String name;
    private final BigDecimal salary;
    private BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String name() {
        return this.name;
    }

    public BigDecimal salary() {
        return this.salary;
    }

    public abstract void setBonus(BigDecimal bonus);

    public BigDecimal toPay() {
        return this.salary.add(getBonus());
    }

    public BigDecimal getBonus() {
        return this.bonus;
    }


}
