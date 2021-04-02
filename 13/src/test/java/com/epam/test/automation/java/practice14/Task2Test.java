package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task2;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task2Test {
    List<String> testList = List.of("Hello", "world", "!", "Good", "morning", "!");
    List<Integer> resultList = List.of(1, 1, 4, 5, 5, 7);

    @Test
    public void testSortAscLengthsOfStrings() {
        Assert.assertEquals(Task2.sortAscLengthsOfStrings(testList), resultList);

    }
}