package com.epam.test.automation.java.practice13.part2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Part2Test {

    @Test
    public void testCountingElement(){
        Part2 arrayList = new Part2();
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(i);
        }
        Assert.assertNotNull(arrayList.removeByIndex(list,3));
    }
    
}