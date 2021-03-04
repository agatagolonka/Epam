package com.epam.test.automation.java.practice6;

import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CompanyTest extends TestCase {


        @Test
        public void testSalesPersonName(){
            SalesPerson emp1=new SalesPerson("Marek", BigDecimal.valueOf(3500),150);
            SalesPerson emp2=new SalesPerson("Zenon", BigDecimal.valueOf(2500),150);
            Employee[] ArrEmp={emp1,emp2};
            Company com1=new Company(ArrEmp);
            com1.giveEverybodyBonus(BigDecimal.valueOf(100));
            Assert.assertEquals(BigDecimal.valueOf(6400), com1.totalToPay());
        }



}