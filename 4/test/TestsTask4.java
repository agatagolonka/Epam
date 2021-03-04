package com.epam.test.automation.java.practice4;
import org.testng.annotations.Test;

import org.testng.Assert;

public class TestsTask4 {
        @Test
    public void testTask4() {
        SortOrder enumTest = SortOrder.DESC;

        Assert.assertEquals(175, Task4.sumGeometricElements(100,0.5,20));

    }
}
