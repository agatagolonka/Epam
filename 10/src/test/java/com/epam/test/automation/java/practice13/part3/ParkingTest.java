package com.epam.test.automation.java.practice13.part3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParkingTest {

    @Test
    public void arriveTest(){
        Parking parking = new Parking(4);
        Assert.assertEquals(parking.arrive(1), true);
    }
    
}