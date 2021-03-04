package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Company {
    private Employee[] staff;

    public Company(Employee[] staff) {
        this.staff = staff;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus){
        for(int i=0;i<staff.length;i++){
            staff[i].setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay(){
        BigDecimal amountSalary = BigDecimal.valueOf(0);
        for(int i=0;i<staff.length;i++){
            amountSalary=amountSalary.add(staff[i].toPay());
            System.out.println();
        }
        return amountSalary;
    }

    public String nameMaxSalary(){
        BigDecimal maxSalary=staff[0].salary();
        int maxSalaryIterator=0;
        for(int i=0;i<staff.length;i++){
            if ((maxSalary.compareTo(staff[i].salary())==-1)||(maxSalary.compareTo(staff[i].salary())==0)){
                maxSalary=staff[i].salary();
                maxSalaryIterator=i;
            }


        }
        return staff[maxSalaryIterator].name();
    }
}
