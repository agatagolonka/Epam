package com.epam.test.automation.java.practice13.part6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Part6Test {

    @Test
    public void testDuplicates() throws IOException {
        String test="RAUGAJ\n" +"NOSIB\n" +"ELAHW";
        Part6 task1 = new Part6();
        task1.listOfWords = task1.readFile("part6.txt");
        Part63 part63 = new Part63(task1.listOfWords);
        Assert.assertEquals(part63.toString(),test);

    }
}
