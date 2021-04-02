package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task3;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task3Test {
    List<String> testList = List.of("asd", "a", "basdw");
    List<String> resultList = List.of("ad", "aa", "bw");

    @Test
    public void testTask3() {
        Assert.assertEquals(Task3.getListExtremeLetters(testList), resultList);

    }
}
