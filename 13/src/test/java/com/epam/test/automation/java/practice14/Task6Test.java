package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task6;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task6Test {
    List<String> testListStr = List.of("1aa", "aaa", "1", "a");
    List<Integer> testListInt = List.of(1, 3, 4);
    List<String> resultList = List.of("1", "1aa", "Not Found");

    @Test
    public void testTask6() {
        Assert.assertEquals(Task6.shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber(testListInt, testListStr), resultList);

    }
}
