package com.epam.test.automation.java.practice13.part5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TreeTest {

    @Test
    public void testAdd(){
        Tree<Integer> tree = new Tree<>();
        Assert.assertEquals(tree.add(3), true);
    }
    
}
