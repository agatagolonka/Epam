package com.epam.test.automation.java.practice10.task1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    @Test
    public void testMain() {
        Florist florist = new Florist();
        Assert.assertEquals(florist.calculatePrice(5.0, Month.FEBRUARY), 10);
    }
}