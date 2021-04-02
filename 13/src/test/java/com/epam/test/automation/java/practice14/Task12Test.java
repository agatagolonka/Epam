package com.epam.test.automation.java.practice14;

import com.epam.test.automation.java.practice14.advanced.task12.NumberPair;
import com.epam.test.automation.java.practice14.advanced.task12.Task12;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class  Task12Test {
    List<Integer> testList1 = List.of(1, 2, 33, 44);
    List<Integer> testList2 = List.of(11, 22, 13);

    List<NumberPair> resultList = List.of(
            new NumberPair(1, 11),
            new NumberPair(2, 22),
            new NumberPair(33, 13)
    );

    @Test
    public void testTask12() {
        Assert.assertEquals(Task12.makeNumberPairsFromTwoList(testList1, testList2), resultList);

    }
}