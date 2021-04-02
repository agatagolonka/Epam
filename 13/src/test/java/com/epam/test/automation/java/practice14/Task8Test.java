package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task8;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task8Test {
    Integer D = 3;
    Integer K = 4;
    List<Integer> testListInt = List.of(-10, 3, -3, 4, 55, 6);
    List<Integer> resultList = List.of(55, 6, 4);

    @Test
    public void testTask8() {
        Assert.assertEquals(Task8.getSortedUnionTwoSubsetsIntegers(D, K, testListInt), resultList);

    }

}