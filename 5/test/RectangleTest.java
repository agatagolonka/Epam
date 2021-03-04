package com.epam.test.automation.java.practice5;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {

    private Rectangle main = new Rectangle();
    @Test
    public void Rectangle() {
       Assert.assertEquals(12,main.area());
    }
    

}