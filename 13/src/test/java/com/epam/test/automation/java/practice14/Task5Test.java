package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task5;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task5Test {
    List<Integer> testList = List.of(1, 2, 3, 4, 5, 6);
    List<String> resultList = List.of("1", "3", "5");

    @Test
    public void testTask5() {
        Assert.assertEquals(Task5.getSortedAscOddValues(testList), resultList);

    }

}