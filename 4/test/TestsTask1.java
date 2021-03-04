package com.epam.test.automation.java.practice4;
import org.testng.annotations.Test;

import org.testng.Assert;

public class TestsTask1 {

    @Test
    public void testTask1() {
        int[] test={4,3,2,1};
        SortOrder enumTest = SortOrder.DESC;

        Assert.assertEquals(true, Task1.isSorted(test,enumTest));

    }
}
