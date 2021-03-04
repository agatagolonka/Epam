package com.epam.test.automation.java.practice6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class ManagerTest {
    @Test
    public void ValidDataTest(){

        Manager emp2=new Manager("Marek",BigDecimal.valueOf(3500),150);
        emp2.setBonus(new BigDecimal(15));
            Assert.assertEquals(BigDecimal.valueOf(515), emp2.getBonus());
        System.out.println("Sdf");

    }

}
