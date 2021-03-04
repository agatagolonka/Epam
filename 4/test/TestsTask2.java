package com.epam.test.automation.java.practice4;
import org.testng.annotations.Test;

import org.testng.Assert;

public class TestsTask2 {

    @Test
    public void testTask2() {
        int[] test = {15, 10, 3};
        int[] result = {15, 11, 5};
        SortOrder enumTest = SortOrder.DESC;

        Assert.assertEquals(result, Task2.transform(test, enumTest));

    }       

}
