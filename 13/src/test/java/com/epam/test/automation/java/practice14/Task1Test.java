package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.low.Task1;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task1Test {
    char testChar = 'a';
    List<String> testList = List.of("Hello", "qwerty", "asda", "asdfa", "as", "a");
    List<String> resultList = List.of("asda", "asdfa");

    @Test
    public void testTask1() {

        Assert.assertEquals(Task1.filterByFirstAndLastCharacter(testChar, testList), resultList);
    }
}
