package com.epam.test.automation.java.practice2;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTest {
    
    @Test
    public void TestTask1() {
        Assert.assertEquals(4, Main.task1(1234));
    }
    
    @Test
    public void TestTask2() {
        Assert.assertEquals(3, Main.task2(14));
    }
    
    @Test
    public void TestTask3() {
        Assert.assertEquals(33, Main.task3(8));
    }
    
    
}
