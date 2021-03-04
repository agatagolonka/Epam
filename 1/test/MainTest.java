package com.epam.test.automation.java.practice1;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.junit.*;


public class MainTest {
    int testData = 256;
    int positive = 4;
    int zero= 0;
    int negative = -2;
    int toLong = 2345;
    int toShort = 23;
    
@BeforeClass
 public void setUp() {
     
 }
 
 @Test
 public void TestTask1PositiveValue() {
     
        Assert.assertEquals(16, Main.task1(positive));
   
 }
  @Test
 public void TestTask1ZeroValue() {
     
        Assert.assertEquals(0, Main.task1(zero));
   
 }
  @Test
 public void TestTask1NegativeValue() {
     
        Assert.assertEquals(2, Main.task1(negative));
   
 }

 
 @Test
 public void TestTask2Correct() {
     
        Assert.assertEquals(652, Main.task2(testData));
   
 }
 
 @Test
 public void TestTask2ToShort() {
     
        Assert.assertEquals("Enter a three-digit number", Main.task2(toShort));
   
 }
@Test
 public void TestTask2ToLong() {
     
        Assert.assertEquals("Enter a three-digit number", Main.task2(toLong));
   
 }
 
 @AfterClass
    public void doCleanup(){
    }
}