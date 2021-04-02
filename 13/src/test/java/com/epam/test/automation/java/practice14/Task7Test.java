package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.middle.Task7;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Task7Test {
    Integer num = 5;
    List<Integer> testListInt = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    List<Integer> resultList = List.of(9, 7, 4, 2);

    @Test
    public void testTask7() {
        Assert.assertEquals(Task7.getSortedDifferenceBetweenSubsets(num, testListInt), resultList);

    }
}
