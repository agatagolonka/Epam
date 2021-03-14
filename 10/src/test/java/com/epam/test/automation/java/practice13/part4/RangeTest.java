package com.epam.test.automation.java.practice13.part4;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RangeTest {

    @Test
    public void test(){
        Range range = new Range(2, 4);
        List<Integer> listOfNumbers=new ArrayList<>();
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);

        Assert.assertEquals(range, listOfNumbers);
    }

}
