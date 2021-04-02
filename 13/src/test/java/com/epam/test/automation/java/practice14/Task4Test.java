package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task4;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task4Test {
    Integer num = 2;
    List<String> testList = List.of("8DC3", "4F", "B", "3S", "S3", "A1", "2A3G", "1B");
    List<String> resultList = List.of("A1", "S3");

    @Test
    public void testTask4() {
        Assert.assertEquals(Task4.filterAndSortByLastDigit(num, testList), resultList);

    }
}
