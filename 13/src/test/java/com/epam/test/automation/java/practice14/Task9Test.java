package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task9;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task9Test {

    List<String> testList = List.of("ABC", "A", "BCD", "D");
    List<String> resultList = List.of("4-A", "3-B", "1-D");

    @Test
    public void testTask9() {
        Assert.assertEquals(Task9.shouldReturnStringListWithLengthAndFirstLetter(testList), resultList);

    }
}
