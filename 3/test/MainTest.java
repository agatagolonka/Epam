package com.epam.test.automation.java.practice3;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
     @Test
 public void testTask2() {
     int[] testArray={5, 350, 350, 4, 350};
    
        Assert.assertEquals(3, Main.task2(testArray));
   
 }


}