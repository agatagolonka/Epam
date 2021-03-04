package com.epam.test.automation.java.practice11;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStackTest {

    @Test
    public void TestEmptyStack(){
        MyStack<Integer> stack = new MyStack<Integer>();
        Assert.assertEquals(stack.empty(), true);

    }

}