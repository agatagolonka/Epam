package com.epam.test.automation.java.practice6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class SalesPersonTest {
    @Test
    public void testSalesPersonName(){
        SalesPerson emp1=new SalesPerson("Marek",BigDecimal.valueOf(3500),150);
        emp1.setBonus(BigDecimal.valueOf(101));
        Assert.assertEquals(BigDecimal.valueOf(202), emp1.getBonus());
    }

}
