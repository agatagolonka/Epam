package com.epam.test.automation.java.practice13.part1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordContainerTest {


    @Test
    public void TestAddEl() {
        WordContainer wc = new WordContainer();
        Word toAdd = new Word("bebok");
        Assert.assertEquals(wc.put(toAdd), toAdd);
    }
}
