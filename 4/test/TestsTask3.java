package com.epam.test.automation.java.practice4;
import org.testng.annotations.Test;

import org.testng.Assert;

public final class TestsTask3 {



    @Test
    public void testTask2() {
        SortOrder enumTest = SortOrder.DESC;

        Assert.assertEquals(6160, Task3.multiArithmeticElements(5,3,4));

    }
}
