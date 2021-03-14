package com.epam.test.automation.java.practice9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatrixTest{

    @Test
    public void testSetValue() throws MatrixException {
        Matrix matrix=new Matrix(4,4);
        matrix.setValue(1, 1, 5);
        Assert.assertEquals(matrix.getValue(1, 1), 5);

    }
}