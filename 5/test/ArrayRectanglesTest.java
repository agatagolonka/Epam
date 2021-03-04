package com.epam.test.automation.java.practice5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayRectanglesTest {
    private ArrayRectangles arrayWithRectangles = new ArrayRectangles(3);
    Rectangle rec=new Rectangle();
    @Test
    public void testAddRectangleToArray(Rectangle rec) {
        Assert.assertEquals(true, arrayWithRectangles.addRectangle(rec));
      
    }
    
}