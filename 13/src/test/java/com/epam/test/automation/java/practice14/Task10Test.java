package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task10;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task10Test {
    List<String> testList = List.of("asnsbiu", "asdsad", "asnsb", "asdf", "asdfb", "as", "a", "aop");
    List<Character> resultList = List.of('U', 'D', 'B', 'B', 'F', 'P', 'S', 'A');

    @Test
    public void testTask10() {
        Assert.assertEquals(Task10.getSortedLastLettersInUpperCase(testList), resultList);

    }
}
